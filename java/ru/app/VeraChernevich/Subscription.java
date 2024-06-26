package ru.app.VeraChernevich;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Data
@Entity
@NoArgsConstructor
@Table(name = "Subscriptions")
public class Subscription {

    @EmbeddedId
    private SubscriptionKey subscriptionKey;

    @Column(name = "subscription_date")
    private Date subscriptionDate;

}
