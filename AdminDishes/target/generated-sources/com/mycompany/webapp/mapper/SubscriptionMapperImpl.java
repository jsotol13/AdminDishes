package com.mycompany.webapp.mapper;

import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserSubscription;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-12-14T22:17:22-0600",
    comments = "version: 1.0.0.CR2, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
public class SubscriptionMapperImpl implements SubscriptionMapper {

    @Override
    public List<SubscriptionDTO> subscriptionsToSubscriptionsDTOs(List<Subscription> subscriptions) {
        if ( subscriptions == null ) {
            return null;
        }

        List<SubscriptionDTO> list = new ArrayList<SubscriptionDTO>();
        for ( Subscription subscription : subscriptions ) {
            list.add( subscriptionToSubscriptionDTO( subscription ) );
        }

        return list;
    }

    @Override
    public SubscriptionDTO subscriptionToSubscriptionDTO(Subscription subscription) {
        if ( subscription == null ) {
            return null;
        }

        SubscriptionDTO subscriptionDTO_ = new SubscriptionDTO();

        subscriptionDTO_.setWeek( subscription.getWeek() );
        subscriptionDTO_.setYear( subscription.getYear() );
        subscriptionDTO_.setName( subscription.getName() );
        subscriptionDTO_.setDescription( subscription.getDescription() );
        subscriptionDTO_.setState( subscription.getState() );
        subscriptionDTO_.setSubscriptionID( subscription.getSubscriptionID() );
        subscriptionDTO_.setUserSubscription( userSubscriptionSetToUserSubscriptionArray( subscription.getUserSubscription() ) );

        return subscriptionDTO_;
    }

    protected com.mycompany.webapp.model.UserSubscription[] userSubscriptionSetToUserSubscriptionArray(Set<UserSubscription> set) {
        if ( set == null ) {
            return null;
        }

        UserSubscription[] userSubscriptionTmp = new UserSubscription[set.size()];
        int i = 0;
        for ( UserSubscription userSubscription : set ) {
            userSubscriptionTmp[i] = userSubscription;
            i++;
        }

        return userSubscriptionTmp;
    }
}
