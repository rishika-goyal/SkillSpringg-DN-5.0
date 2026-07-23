import FlightDetails from "./FlightDetails";

function UserPage() {

    return (

        <div>

            <h2>Welcome User</h2>

            <p>You can now book your tickets.</p>

            <FlightDetails />

            <br />

            <button>

                Book Ticket

            </button>

        </div>

    );

}

export default UserPage;