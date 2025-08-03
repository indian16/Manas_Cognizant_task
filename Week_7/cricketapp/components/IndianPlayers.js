// src/components/IndianPlayers.js
import React from "react";

const IndianPlayers = () => {
  const players = [
    "Virat Kohli", "Rohit Sharma", "KL Rahul",
    "Hardik Pandya", "Ravindra Jadeja", "Jasprit Bumrah",
    "Shubman Gill", "Ishan Kishan", "Surya Kumar Yadav",
    "Kuldeep Yadav", "Mohammed Siraj"
  ];

  // Destructuring players into even & odd teams
  const oddTeam = players.filter((_, index) => index % 2 !== 0);
  const evenTeam = players.filter((_, index) => index % 2 === 0);

  // Declare T20 & Ranji players
  const T20Players = ["Virat Kohli", "Hardik Pandya", "Bumrah"];
  const RanjiPlayers = ["Cheteshwar Pujara", "Ajinkya Rahane"];

  // Merge using ES6 spread
  const allPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, idx) => <li key={idx}>{player}</li>)}
      </ul>

      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, idx) => <li key={idx}>{player}</li>)}
      </ul>

      <h2>Merged Team (T20 + Ranji)</h2>
      <ul>
        {allPlayers.map((player, idx) => <li key={idx}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
