function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 82 },
        { name: "KL Rahul", score: 68 },
        { name: "Shubman Gill", score: 91 },
        { name: "Hardik Pandya", score: 76 },
        { name: "Ravindra Jadeja", score: 65 },
        { name: "R Ashwin", score: 55 },
        { name: "Mohammed Shami", score: 40 },
        { name: "Jasprit Bumrah", score: 73 },
        { name: "Surya Kumar Yadav", score: 88 },
        { name: "Ishan Kishan", score: 61 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div style={{ margin: "20px" }}>
            <h2>List of Players</h2>

            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                </thead>

                <tbody>

                    {players.map((player, index) => (

                        <tr key={index}>
                            <td>{player.name}</td>
                            <td>{player.score}</td>
                        </tr>

                    ))}

                </tbody>

            </table>

            <h3>Players having score below 70</h3>

            <ul>

                {below70.map((player, index) => (

                    <li key={index}>
                        {player.name} - {player.score}
                    </li>

                ))}

            </ul>

        </div>
    );
}

export default ListofPlayers;