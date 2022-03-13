import MovieScore from "../moviescore";
import { Link } from 'react-router-dom'
import './styles.css'
import { Movie } from '../../types/movie'

type Props = {
  movie: Movie
}

export default function MovieCard({ movie} : Props) {
  
  return (
    <div>
      <img
        className="movie-card-image"
        src={movie.image}
        alt={movie.title}
      />
      <div className="card-style">
        <h3 style={{
          fontSize: "0.9rem"
        }}>{movie.title}</h3>
        <MovieScore count={movie.count} score={movie.score}/>

        <Link to={`/form/${movie.id}`} >
            <div className="btn btn-primary movie-btn">Avaliar</div>
        </Link>
      </div>
    </div>
  );
}
