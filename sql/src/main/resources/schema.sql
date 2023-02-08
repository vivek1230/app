-- Create Schema: `ShopInZone`
IF NOT EXISTS(SELECT * FROM sys.schemas WHERE name='ShopInZone') EXEC('CREATE SCHEMA ShopInZone')

-- Create Table: `UserDetails`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'ShopInZone' AND t.name = 'UserDetails')
BEGIN
    CREATE TABLE ShopInZone.UserDetails(
        UserId bigint IDENTITY,
        Name nvarchar(100) NOT NULL,
        Email nvarchar(100) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        Created datetimeoffset NOT NULL default(current_timestamp),
        LastUpdated datetimeoffset NOT NULL default(current_timestamp),
        CONSTRAINT PK_UserDetails PRIMARY KEY (Email, Mobile)
    )
END;

-- Create Table: `UserEntity`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'ShopInZone' AND t.name = 'UserEntity')
BEGIN
    CREATE TABLE ShopInZone.UserEntity(
        UserId bigint IDENTITY,
        Email nvarchar(100) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        Password nvarchar(100) NOT NULL,
        UserRoleType nvarchar(20) NOT NULL,
        Created datetimeoffset NOT NULL default(current_timestamp),
        LastUpdated datetimeoffset NOT NULL default(current_timestamp),
        CONSTRAINT PK_UserEntity PRIMARY KEY (Email, Mobile)
    )
END;

-- Create Table: `ProfileEntity`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'ShopInZone' AND t.name = 'ProfileEntity')
BEGIN
    CREATE TABLE ShopInZone.ProfileEntity(
        ProfileId bigint IDENTITY,
        Email nvarchar(100) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        Name nvarchar(100) NOT NULL,
        Gender nvarchar(20) NOT NULL,
        PinCode nvarchar(10) NOT NULL,
        City nvarchar(200) NOT NULL,
        Created datetimeoffset NOT NULL default(current_timestamp),
        LastUpdated datetimeoffset NOT NULL default(current_timestamp),
        CONSTRAINT PK_ProfileEntity PRIMARY KEY (Email, Mobile)
    )
END;

-- Create Table: `AddressEntity`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'ShopInZone' AND t.name = 'AddressEntity')
BEGIN
    CREATE TABLE ShopInZone.AddressEntity(
        AddressId bigint IDENTITY,
        Email nvarchar(100) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        Name nvarchar(100) NOT NULL,
        AddressType nvarchar(20) NOT NULL,
        LandMark nvarchar(200) NOT NULL,
        State nvarchar(100) NOT NULL,
        AddressText nvarchar(500) NOT NULL,
        PinCode nvarchar(10) NOT NULL,
        City nvarchar(200) NOT NULL,
        Created datetimeoffset NOT NULL default(current_timestamp),
        LastUpdated datetimeoffset NOT NULL default(current_timestamp)
    )
END;

