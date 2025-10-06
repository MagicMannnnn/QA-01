import React, { useState } from 'react';
import '../styles/App.css'; // Import the styling

const Player = () => {
  const [cards, setCards] = useState([]);

  const start = async () => {
    setCards([]);
    for (let i = 0; i < 2; i++){
        await new Promise(resolve => setTimeout(resolve, 200));
        try {
            const response = await fetch('http://localhost:3000/getCard');
            if (!response.ok) throw new Error('Failed to fetch card');

            const data = await response.json();
            console.log(data.card);
            const cardUrl = `../../SVG-cards-1.3/${data.card}.svg`;
            setCards(prev => [...prev, cardUrl]);
        } catch (error) {
            console.error('Error fetching card:', error);
        }
    }
    
  };

  return (
    <div className="player-container">
      <button className="play-button" onClick={start}>Play</button>
      
      <div className="card-row">
        {cards.map((url, index) => (
          <img key={index} src={url} alt={`Card ${index}`} className="card-image" />
        ))}
      </div>
    </div>
  );
};

export default Player;
