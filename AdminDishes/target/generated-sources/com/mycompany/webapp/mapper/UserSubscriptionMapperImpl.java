package com.mycompany.webapp.mapper;

import com.mycompany.webapp.dto.UserSubscriptionDTO;
import com.mycompany.webapp.model.UserSubscription;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-12-16T00:28:22-0600",
    comments = "version: 1.0.0.CR2, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
public class UserSubscriptionMapperImpl implements UserSubscriptionMapper {

    @Override
    public List<UserSubscriptionDTO> userSubscriptionsToUserSubscriptionsDTOs(List<UserSubscription> userSubscriptions) {
        if ( userSubscriptions == null ) {
            return null;
        }

        List<UserSubscriptionDTO> list = new ArrayList<UserSubscriptionDTO>();
        for ( UserSubscription userSubscription : userSubscriptions ) {
            list.add( userSubscriptionToUserSubscriptionDTO( userSubscription ) );
        }

        return list;
    }

    @Override
    public UserSubscriptionDTO userSubscriptionToUserSubscriptionDTO(UserSubscription userSubscription) {
        if ( userSubscription == null ) {
            return null;
        }

        UserSubscriptionDTO userSubscriptionDTO_ = new UserSubscriptionDTO();

        userSubscriptionDTO_.setUserSubscriptionID( userSubscription.getUserSubscriptionID() );
        userSubscriptionDTO_.setSubscription( userSubscription.getSubscription() );
        userSubscriptionDTO_.setUserCus( userSubscription.getUserCus() );

        return userSubscriptionDTO_;
    }
}
