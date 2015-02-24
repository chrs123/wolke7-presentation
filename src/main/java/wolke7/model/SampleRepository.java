package wolke7.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Thomas Schoenfeld
 * @date 2015-02-08
 *
 */
@RepositoryRestResource(collectionResourceRel = "samples", path = "samples")
public interface SampleRepository extends MongoRepository<Sample, String> {

	List<Sample> findBySampleName(@Param("sampleName") String sampleName);

	// Optional<Sample> findOne(String id);

}
