package com.mycompany.webapp.mapper;

import com.mycompany.webapp.dto.UserCusDTO;
import com.mycompany.webapp.model.UserCus;
import com.mycompany.webapp.model.UserSubscription;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-12-16T00:28:22-0600",
    comments = "version: 1.0.0.CR2, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
public class UserCusMapperImpl implements UserCusMapper {

    @Override
    public List<UserCusDTO> usersCusToUsersCusDTOs(List<UserCus> users) {
        if ( users == null ) {
            return null;
        }

        List<UserCusDTO> list = new ArrayList<UserCusDTO>();
        for ( UserCus userCus : users ) {
            list.add( userToUserDTO( userCus ) );
        }

        return list;
    }

    @Override
    public UserCusDTO userToUserDTO(UserCus userCus) {
        if ( userCus == null ) {
            return null;
        }

        UserCusDTO userCusDTO_ = new UserCusDTO();

        userCusDTO_.setIdProfile( userCus.getIdProfile() );
        userCusDTO_.setState( userCus.getState() );
        userCusDTO_.setUserId( userCus.getUserId() );
        userCusDTO_.setNickName( userCus.getNickName() );
        userCusDTO_.setUserSubscription( userSubscriptionSetToUserSubscriptionArray( userCus.getUserSubscription() ) );
        userCusDTO_.setPassword( userCus.getPassword() );

        return userCusDTO_;
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
