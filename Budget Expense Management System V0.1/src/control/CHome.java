package control;

import model.MHome;

public class CHome
{
    MHome mh = new MHome();
    public String getFirstName(String email)
    {
        return mh.getFirstName(email);
    }
    
    public String getLastName(String email)
    {
        return mh.getLastName(email);
    }
    
}
