# --- First database schema

# --- !Ups

create table menu (
  id                        bigint not null,
  nombre                    varchar(255),
  ingredientes              varchar(255),
  descripcion               varchar(255),
  precio                    varchar(255),
 
  constraint pk_menu primary key (id))
;


create sequence menu_seq start with 1000;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;


drop table if exists menu;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists menu_seq;

