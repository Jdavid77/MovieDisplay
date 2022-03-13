import { useParams } from 'react-router-dom'
import FormCard from '../../components/formcard';


export default function Form() {

  const params = useParams();
  
  return (
    <FormCard movieId={`${params.movieId}`}/>
  );
}
