import './styles.css'

function Pagination() {
  return (
    <div className="pagination-container">
      <div className="pagination-box">
        <button className="pagination-button" disabled={true}>
        <i className="bi bi-arrow-left-short"></i>
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="pagination-button" disabled={false}>
            <i className="bi bi-arrow-right-short"></i>
        </button>
      </div>
    </div>
  );
}

export default Pagination;
