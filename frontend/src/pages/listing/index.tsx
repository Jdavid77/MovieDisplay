import Pagination from "../../components/pagination/index";
import MovieCard from "../../components/moviecard";
import axios from "axios";
import { BASE_URL } from "../../utils/requests";
import { useEffect, useState } from 'react'
import { MoviePage } from "../../types/movie";

export default function Listing() {

  const [pageNumber,setPageNumber] = useState(0);

  const [page,setPage] = useState<MoviePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true,
  });


  useEffect(() => {
    axios.get(`${BASE_URL}/movies?size=12&page=${pageNumber}`)
    .then(response => {
      const data = response.data as MoviePage;
      setPage(data);
    })
  }, [pageNumber])

  const handlePageChange = (newPageNumber: number) => {
    setPageNumber(newPageNumber);
  }

  

  return (
    <>
      <Pagination page={page} onChange={handlePageChange}/>
      <div className="container">
        <div className="row">
          {page.content.map((movie,i) => {
            return (
              <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                <MovieCard key={i} movie={movie}/>
              </div>
            )
          })}
        </div>
      </div>
    </>
  );
}
