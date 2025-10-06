import {  } from 'react'
import './styles/App.css'
import Home from './pages/Home';
import AppContext from './context/AppContext'

function App() {

  return (
    <AppContext>
      <Home />
    </AppContext>
  )
}

export default App;
