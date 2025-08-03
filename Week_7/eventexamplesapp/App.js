import React, { useState } from "react";
import CurrencyConvertor from "./components/CurrencyConvertor";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  // a. Increment function
  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  // b. Say Hello function
  const sayHello = () => {
    console.log("Hello! You've increased the counter.");
  };

  // Decrement function
  const decrement = () => {
    setCount(prev => prev - 1);
  };

  // 2. Say welcome with argument
  const sayWelcome = (msg) => {
    alert(`Welcome Message: ${msg}`);
  };

  // 3. Synthetic event handler
  const handleClick = (e) => {
    alert("I was clicked");
    console.log("Synthetic event:", e);
  };

  return (
    <div className="App">
      <h1>🎯 Event Handling in React</h1>

      {/* Counter Buttons */}
      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <br /><br />

      {/* Say Welcome */}
      <button onClick={() => sayWelcome("Welcome to React Event Examples!")}>
        Say Welcome
      </button>

      <br /><br />

      {/* Synthetic Event */}
      <button onClick={handleClick}>Click Me (Synthetic Event)</button>

      <br /><br />

      {/* Currency Converter */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
