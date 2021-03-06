import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from './pages/listing/index';
import Form from './pages/form/index';
import Navbar from "./components/navbar/index";

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;