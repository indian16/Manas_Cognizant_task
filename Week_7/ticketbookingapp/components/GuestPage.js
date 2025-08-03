import React from 'react';

const GuestPage = () => {
  const flights = [
    { id: 1, from: "Delhi", to: "Mumbai", time: "10:00 AM" },
    { id: 2, from: "Bangalore", to: "Chennai", time: "2:00 PM" },
    { id: 3, from: "Kolkata", to: "Pune", time: "5:00 PM" }
  ];

  return (
    <div>
      <h2>Guest Page - Flight Details</h2>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
             {flight.from}  {flight.to} at {flight.time}
          </li>
        ))}
      </ul>
      <p><strong>Login to book your ticket!</strong></p>
    </div>
  );
};

export default GuestPage;
