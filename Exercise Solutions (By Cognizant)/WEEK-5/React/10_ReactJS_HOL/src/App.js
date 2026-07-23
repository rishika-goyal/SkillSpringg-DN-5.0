import "./App.css";

import office1 from "./office1.jpg";
import office2 from "./office2.jpg";
import office3 from "./office3.jpg";

function App() {

  const offices = [
    {
      name: "Tech Park Office",
      rent: 55000,
      address: "Madhapur, Hyderabad",
      image: office1
    },
    {
      name: "Business Hub",
      rent: 75000,
      address: "Hitech City, Hyderabad",
      image: office2
    },
    {
      name: "Corporate Space",
      rent: 45000,
      address: "Gachibowli, Hyderabad",
      image: office3
    }
  ];

  return (

    <div>

      <div className="header">
        <h1>Office Space Rental Application</h1>
      </div>

      <div className="container">

        {offices.map((office, index) => (

          <div className="card" key={index}>

            <img
              src={office.image}
              alt={office.name}
            />

            <h2>{office.name}</h2>

            <h3>

              Rent :

              <span
                style={{
                  color:
                    office.rent < 60000 ? "red" : "green"
                }}
              >
                ₹ {office.rent}
              </span>

            </h3>

            <p>

              <strong>Address :</strong>

              {office.address}

            </p>

          </div>

        ))}

      </div>

    </div>

  );

}

export default App;