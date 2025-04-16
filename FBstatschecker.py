def get_team_data():
    teams = []
    n = int(input("Enter number of teams: "))
    for _ in range(n):
        name = input("Team name: ")
        played = int(input("Played: "))
        won = int(input("Won: "))
        draw = int(input("Draw: "))
        lost = int(input("Lost: "))
        gf = int(input("Goals For: "))
        ga = int(input("Goals Against: "))

        points = won * 3 + draw
        gd = gf - ga

        teams.append({
            "Team": name,
            "Played": played,
            "Won": won,
            "Draw": draw,
            "Lost": lost,
            "GF": gf,
            "GA": ga,
            "Points": points,
            "GD": gd
        })
    return sorted(teams, key=lambda x: x["Points"], reverse=True)

def show_table(teams):
    print(f"{'Team':<12}{'Pts':>5}  {'P':>2}  {'W':>2}  {'D':>2}  {'L':>2}  {'GF':>3}  {'GA':>3}  {'GD':>3}")
    print("-" * 50)
    for team in teams:
        print(f"{team['Team']:<12}{team['Points']:>5}  {team['Played']:>2}  {team['Won']:>2}  {team['Draw']:>2}  {team['Lost']:>2}  {team['GF']:>3}  {team['GA']:>3}  {team['GD']:>3}")

if __name__ == "__main__":
    teams = get_team_data()
    show_table(teams)
