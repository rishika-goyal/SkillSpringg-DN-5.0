import "../Stylesheets/mystyle.css";

function CalculateScore() {
  const name = "Rahul";
  const school = "ABC School";
  const total = 500;
  const goal = 5;
  const average = total / goal;

  return (
    <div className="container">
      <h1>Student Score Calculator</h1>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total:</strong> {total}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average}</p>
    </div>
  );
}

export default CalculateScore;