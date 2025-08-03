import React, { useState } from "react";

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    // 1 Euro = 90 INR (approx conversion rate)
    const euroValue = (parseFloat(rupees) / 90).toFixed(2);
    setEuros(euroValue);
  };

  return (
    <div>
      <h2>💱 Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in ₹ (INR)"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          required
        />
        <button type="submit">Convert</button>
      </form>

      {euros && <p>Converted Value: €{euros}</p>}
    </div>
  );
};

export default CurrencyConvertor;
