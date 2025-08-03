import React, { useState } from 'react';

const UserPage = () => {
  const [bookedFlight, setBookedFlight] = useState(null);

  const flights = [
    { id: 1, from: "Delhi", to: "Mumbai", time: "10:00 AM" },
    { id: 2, from: "Bangalore", to: "Chennai", time: "2:00 PM" },
    { id: 3, from: "Kolkata", to: "Pune", time: "5:00 PM" }
  ];

  const bookFlight = (flight) => {
    setBookedFlight(flight);
  };

  return (
    <div>
      <h2>Welcome User - Book Your Flight</h2>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            ✈️ {flight.from} ➡ {flight.to} at {flight.time}
            <button style={{ marginLeft: '10px' }} onClick={() => bookFlight(flight)}>Book</button>
          </li>
        ))}
      </ul>

      {bookedFlight && (
        <div style={{ marginTop: '20px' }}>
          <h3>✅ Booking Confirmed!</h3>
          <p>You have booked a flight from <strong>{bookedFlight.from}</strong> to <strong>{bookedFlight.to}</strong> at <strong>{bookedFlight.time}</strong>.</p>
        </div>
      )}
    </div>
  );
};

export default UserPage;
