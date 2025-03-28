#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

class Player {
public:
    string name;
    int runs, balls;
    
    Player(string n, int r, int b) {
        name = n;
        runs = r;
        balls = b;
    }

    float getAverage() {
        return (balls == 0) ? 0 : (float)runs / balls;
    }

    float getStrikeRate() {
        return (balls == 0) ? 0 : ((float)runs / balls) * 100;
    }

    void display() {
        cout << left << setw(15) << name 
             << setw(10) << runs 
             << setw(10) << balls 
             << setw(10) << fixed << setprecision(2) << getAverage() 
             << setw(10) << fixed << setprecision(2) << getStrikeRate() 
             << "%" << endl;
    }
};

int main() {
    vector<Player> players;
    int n;

    cout << "Enter number of players: ";
    cin >> n;

    for (int i = 0; i < n; i++) {
        string name;
        int runs, balls;
        
        cout << "\nEnter Player " << i + 1 << " Name: ";
        cin >> name;
        cout << "Enter Runs Scored: ";
        cin >> runs;
        cout << "Enter Balls Faced: ";
        cin >> balls;

        players.push_back(Player(name, runs, balls));
    }

    cout << "\nCricket Stats Analysis:\n";
    cout << left << setw(15) << "Player" 
         << setw(10) << "Runs" 
         << setw(10) << "Balls" 
         << setw(10) << "Avg" 
         << setw(10) << "SR" << endl;
    cout << "----------------------------------------------------" << endl;

    for (auto &player : players) {
        player.display();
    }

    return 0;
}
