package org.uci.spacify.entity;

import lombok.Getter;
import lombok.Setter;
import org.uci.spacify.utilities.Constants;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "mac_address", schema = Constants.SCHEMA_NAME)
public class MacAddressEntity {
    @EmbeddedId
    private MacAddressPK macAddressPK;

    public MacAddressEntity() {
    }

    public MacAddressEntity(MacAddressPK macAddressPK) {
        this.macAddressPK = macAddressPK;
    }
}
