// src/App.js
import React from 'react';
import './App.css';

function App() {
  // Single office object
  const office = {
    name: "Skyline Corporate Hub",
    rent: 55000,
    address: "Tower B, Cyber City, Gurgaon",
    image: "https://via.placeholder.com/400x200.png?text=Office+Image"
  };

  // List of office objects
  const officeList = [
    {
      name: "TechPark One",
      rent: 75000,
      address: "Phase 2, Hinjewadi, Pune"
    },
    {
      name: "Eco Space",
      rent: 48000,
      address: "Sarjapur Road, Bangalore"
    },
    {
      name: "DLF Infinity Tower",
      rent: 90000,
      address: "DLF Phase II, Gurgaon"
    },
  ];

  return (
    <div className="App">
      {/* JSX element for heading */}
      <h1>🏢 Office Space Rental App</h1>

      {/* Display image with JSX attribute */}
      <img src={office.image} alt="Office Space" width="400" height="200" />

      {/* Displaying single office object */}
      <h2>{office.name}</h2>
      <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
        Rent: ₹{office.rent}
      </p>
      <p>Address: {office.address}</p>

      <hr />

      {/* Displaying list of offices */}
      <h2>Available Office Spaces</h2>
      <ul>
        {officeList.map((item, index) => (
          <li key={index} style={{ marginBottom: '20px' }}>
            <strong>{item.name}</strong>
            <p style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
              Rent: ₹{item.rent}
            </p>
            <p>Address: {item.address}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
