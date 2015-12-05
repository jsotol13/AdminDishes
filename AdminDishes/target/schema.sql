
    alter table mealSubscription 
        drop 
        foreign key FK_1ub4um8nkreu92k9xx4k8lbj4;

    alter table mealSubscription 
        drop 
        foreign key FK_sjotneyuut39y10cjf7ux9ecc;

    alter table user_role 
        drop 
        foreign key FK_it77eq964jhfqtu54081ebtio;

    alter table user_role 
        drop 
        foreign key FK_apcc8lxk2xnug8377fatvbn04;

    drop table if exists app_user;

    drop table if exists meal;

    drop table if exists mealSubscription;

    drop table if exists role;

    drop table if exists subscription;

    drop table if exists user_role;

    create table app_user (
        id bigint not null auto_increment,
        account_expired bit not null,
        account_locked bit not null,
        address varchar(150),
        city varchar(50),
        country varchar(100),
        postal_code varchar(15),
        province varchar(100),
        credentials_expired bit not null,
        email varchar(255) not null,
        account_enabled bit,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(255) not null,
        password_hint varchar(255),
        phone_number varchar(255),
        username varchar(50) not null,
        version integer,
        website varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table meal (
        mealID bigint not null auto_increment,
        descriptionMeal varchar(500),
        nameMeal varchar(500),
        picture varchar(1000),
        stateMeal integer,
        primary key (mealID)
    ) ENGINE=InnoDB;

    create table mealSubscription (
        mealSubscriptionID bigint not null auto_increment,
        dayMealSubscription integer,
        mealID bigint not null,
        subscriptionID bigint,
        primary key (mealSubscriptionID)
    ) ENGINE=InnoDB;

    create table role (
        id bigint not null auto_increment,
        description varchar(64),
        name varchar(20),
        primary key (id)
    ) ENGINE=InnoDB;

    create table subscription (
        subscriptionID bigint not null auto_increment,
        description varchar(200),
        name varchar(20),
        state bit,
        week integer,
        year integer,
        primary key (subscriptionID)
    ) ENGINE=InnoDB;

    create table user_role (
        user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) ENGINE=InnoDB;

    alter table app_user 
        add constraint UK_1j9d9a06i600gd43uu3km82jw  unique (email);

    alter table app_user 
        add constraint UK_3k4cplvh82srueuttfkwnylq0  unique (username);

    alter table mealSubscription 
        add constraint FK_1ub4um8nkreu92k9xx4k8lbj4 
        foreign key (mealID) 
        references meal (mealID);

    alter table mealSubscription 
        add constraint FK_sjotneyuut39y10cjf7ux9ecc 
        foreign key (subscriptionID) 
        references subscription (subscriptionID);

    alter table user_role 
        add constraint FK_it77eq964jhfqtu54081ebtio 
        foreign key (role_id) 
        references role (id);

    alter table user_role 
        add constraint FK_apcc8lxk2xnug8377fatvbn04 
        foreign key (user_id) 
        references app_user (id);
