package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Song;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Chris Bay
 */
@Repository
public interface Repository extends CrudRepository<Song, Integer> {
}
