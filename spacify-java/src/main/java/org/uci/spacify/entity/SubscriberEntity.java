package org.uci.spacify.entity;

import lombok.Getter;
import lombok.Setter;
import org.uci.spacify.utilities.Constants;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="subscriber", schema= Constants.SCHEMA_NAME)
public class SubscriberEntity {
    @EmbeddedId
    private UserRoomPK userRoomPK;

    public SubscriberEntity() {
    }
}
