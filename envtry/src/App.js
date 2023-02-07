import React, { Component } from 'react';
import './App.css';
import { API_URL } from './constants';

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <h2>Welcome to React</h2>
          
          
        </div>
        <p className="App-intro">
         <h3> The value from environment variable is {API_URL} </h3>
        </p>
      </div>
    );
  }
}

export default App;
