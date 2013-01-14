package org.hibernate.forge.database;

import java.util.Collection;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import org.hibernate.forge.database.ConnectionProfile;
import org.hibernate.forge.database.ConnectionProfileHelper;

@Alternative
public class MockConnectionProfileHelper extends ConnectionProfileHelper
{
   
   public static Map<String, ConnectionProfile> CONNECTION_PROFILES;
   
   @Override
   public Map<String, ConnectionProfile> loadConnectionProfiles() {
      return CONNECTION_PROFILES;
   }

   @Override
   public void saveConnectionProfiles(Collection<ConnectionProfile> connectionProfiles) {
      for (ConnectionProfile connectionProfile : connectionProfiles) {
         CONNECTION_PROFILES.put(connectionProfile.name, connectionProfile);
      }
   }
   
 
}
