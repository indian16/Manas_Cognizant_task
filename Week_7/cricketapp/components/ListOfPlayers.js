// src/components/ListofPlayers.js
import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat Kohli", score: 85 },
    { name: "Rohit Sharma", score: 65 },
    { name: "KL Rahul", score: 45 },
    { name: "Hardik Pandya", score: 75 },
    { name: "Ravindra Jadeja", score: 80 },
    { name: "Jasprit Bumrah", score: 60 },
    { name: "Shubman Gill", score: 90 },
    { name: "Ishan Kishan", score: 55 },
    { name: "Surya Kumar Yadav", score: 77 },
    { name: "Kuldeep Yadav", score: 50 },
    { name: "Mohammed Siraj", score: 72 },
  ];

  // Players with score < 70
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with Score below 70</h3>
      <ul>
        {lowScorers.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
