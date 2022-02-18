package nvc.it.ice_factory_wasok.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_wasok.model.Camera;

public interface CameraRepository extends MongoRepository<Camera,String> {
    
}
