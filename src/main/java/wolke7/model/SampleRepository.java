package wolke7.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Thomas Schoenfeld
 * @date 2015-02-08
 *
 */
@RepositoryRestResource(collectionResourceRel = "samples", path = "samples")
public interface SampleRepository extends Repository<Sample, String> {

	List<Sample> findBySampleName(@Param("sampleName") String sampleName);

	Optional<Sample> findOne(String id);

}
