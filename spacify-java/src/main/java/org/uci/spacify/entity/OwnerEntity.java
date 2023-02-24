package org.uci.spacify.entity;

import lombok.Getter;
import lombok.Setter;
import org.uci.spacify.utilities.Constants;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="owner", schema= Constants.SCHEMA_NAME)
public class OwnerEntity {
    @EmbeddedId
    private UserRoomPK userRoomPK;

    public OwnerEntity() {
    }
}
