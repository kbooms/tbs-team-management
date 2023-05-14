import './App.css';
import FooterComponent from './Components/FooterComponent';
import HeaderComponent from './Components/HeaderComponent';
import ListEmployeeComponent from './Components/ListEmployeeComponent';

function App() {
  return (
    <div>
      <HeaderComponent />
      <div className="container">
        <ListEmployeeComponent /> 
      </div>
      <FooterComponent />
    </div>
  );
}

export default App;
