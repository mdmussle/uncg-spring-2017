package Authorization;

public interface Authorization
{
    //boolean isAuthorized(User user, String action);
    
    /*The above is commented out beacuse at the time of the
    sync, there was no user class.
    
    The best way (we could think of) to implment this is to use a hasmap
    that takes a string 'Action', what the user is trying to do, and a returns
    an integer authorization level, the rank of said action. 
    
    If there is a docs file, the info will be there instead of here.
    */
}