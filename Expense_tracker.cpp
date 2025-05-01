#include <iostream>
#include <fstream>
#include <vector>
#include <iomanip>

using namespace std;

struct Expense {
    string date;
    string category;
    double amount;
    string note;
};

vector<Expense> readExpenses() {
    vector<Expense> expenses;
    ifstream file("expenses.txt");
    Expense e;
    while (file >> e.date >> e.category >> e.amount) {
        file.ignore();
        getline(file, e.note);
        expenses.push_back(e);
    }
    file.close();
    return expenses;
}

void writeExpense(const Expense& e) {
    ofstream file("expenses.txt", ios::app);
    file << e.date << " " << e.category << " " << e.amount << " " << e.note << endl;
    file.close();
}

void addExpense() {
    Expense e;
    cout << "Enter date (YYYY-MM-DD): ";
    cin >> e.date;
    cout << "Enter category (Food/Transport/Entertainment/Utilities/Other): ";
    cin >> e.category;
    cout << "Enter amount: ";
    cin >> e.amount;
    cin.ignore();
    cout << "Enter note: ";
    getline(cin, e.note);

    writeExpense(e);
    cout << "Expense added successfully.\n";
}

void viewExpenses() {
    vector<Expense> expenses = readExpenses();
    cout << "\n--- All Expenses ---\n";
    cout << left << setw(12) << "Date" << setw(15) << "Category" << setw(10) << "Amount" << "Note\n";
    cout << "------------------------------------------------------\n";
    for (const auto& e : expenses) {
        cout << left << setw(12) << e.date << setw(15) << e.category << setw(10) << e.amount << e.note << endl;
    }
}

void generateReport() {
    vector<Expense> expenses = readExpenses();
    double total = 0;
    cout << "\n--- Monthly Report ---\n";
    for (const auto& e : expenses) {
        total += e.amount;
    }
    cout << "Total Spent: Rs " << fixed << setprecision(2) << total << "\n";
}

int main() {
    int choice;
    do {
        cout << "\n==== Expense Tracker ====\n";
        cout << "1. Add Expense\n";
        cout << "2. View Expenses\n";
        cout << "3. Generate Report\n";
        cout << "4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
            case 1: addExpense(); break;
            case 2: viewExpenses(); break;
            case 3: generateReport(); break;
            case 4: cout << "Goodbye!\n"; break;
            default: cout << "Invalid choice.\n";
        }
    } while (choice != 4);

    return 0;
}
