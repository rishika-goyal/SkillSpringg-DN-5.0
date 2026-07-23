import { useState } from "react";

function Counter() {

    const [count, setCount] = useState(0);

    function increment() {
        setCount(count + 1);
    }

    function decrement() {
        setCount(count - 1);
    }

    function sayHello() {
        alert("Hello!! Member1");
    }

    function incrementMultiple() {
        increment();
        sayHello();
    }

    function sayWelcome(message) {
        alert(message);
    }

    function syntheticEvent(e) {
        alert("I was clicked");
        console.log(e);
    }

    return (

        <div className="card">

            <h2>Counter Example</h2>

            <h1>{count}</h1>

            <button onClick={incrementMultiple}>
                Increment
            </button>

            <button onClick={decrement}>
                Decrement
            </button>

            <br /><br />

            <button
                onClick={() => sayWelcome("Welcome")}
            >
                Say Welcome
            </button>

            <br /><br />

            <button
                onClick={syntheticEvent}
            >
                Synthetic Event
            </button>

        </div>

    );

}

export default Counter;