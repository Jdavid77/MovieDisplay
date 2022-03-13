import { MoviePage } from '../../types/movie';
import './styles.css'

type Props = {
  page: MoviePage;
  onChange: Function;
}


function Pagination({page, onChange} : Props) {

  
  return (
    <div className="pagination-container">
      <div className="pagination-box">
        <button className="pagination-button" disabled={page.first} onClick={() => onChange(page.number - 1)}>
        <i className="bi bi-arrow-left-short"></i>
        </button>
        <p>{`${page.number + 1} de ${page.totalPages}`}</p>
        <button className="pagination-button" disabled={page.last} onClick={() => onChange(page.number + 1)}>
            <i className="bi bi-arrow-right-short"></i>
        </button>
      </div>
    </div>
  );
}

export default Pagination;
