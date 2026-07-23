function FlightDetails() {

    const flights = [

        {
            id: 1,
            from: "Chennai",
            to: "Delhi",
            airline: "IndiGo",
            fare: "₹4500"
        },

        {
            id: 2,
            from: "Hyderabad",
            to: "Mumbai",
            airline: "Air India",
            fare: "₹5200"
        },

        {
            id: 3,
            from: "Bangalore",
            to: "Kolkata",
            airline: "Vistara",
            fare: "₹6100"
        }

    ];

    return (

        <table>

            <thead>

                <tr>

                    <th>ID</th>
                    <th>From</th>
                    <th>To</th>
                    <th>Airline</th>
                    <th>Fare</th>

                </tr>

            </thead>

            <tbody>

                {flights.map((flight) => (

                    <tr key={flight.id}>

                        <td>{flight.id}</td>
                        <td>{flight.from}</td>
                        <td>{flight.to}</td>
                        <td>{flight.airline}</td>
                        <td>{flight.fare}</td>

                    </tr>

                ))}

            </tbody>

        </table>

    );

}

export default FlightDetails;