import { useState } from "react";

import "./App.css";

import GuestPage from "./components/GuestPage";

import UserPage from "./components/UserPage";

function App() {

    const [loggedIn, setLoggedIn] = useState(false);

    return (

        <div className="App">

            <h1>

                Ticket Booking Application

            </h1>

            {

                loggedIn

                    ?

                    <UserPage />

                    :

                    <GuestPage />

            }

            <br />

            {

                loggedIn

                    ?

                    <button

                        onClick={() => setLoggedIn(false)}

                    >

                        Logout

                    </button>

                    :

                    <button

                        onClick={() => setLoggedIn(true)}

                    >

                        Login

                    </button>

            }

        </div>

    );

}

export default App;