package prototype;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * profile for the professionals
 * The profile is not essentially a user; There might be an user connected with this profile or it's just a profile
 */
public class Profile {
	private String identifier;
	private String tel;
	
	private Collection<SkillEndorsement> endorsements;
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void print(){
		System.out.println("Identifier - " + identifier);
		System.out.println("Tel - " + tel);
		
		Map<String, String> endorsementMap = new HashMap<String, String>();
		for(SkillEndorsement se : endorsements){
			String suggester = endorsementMap.get(se.getSkill().getName());
			if(suggester != null){
				suggester += " / " + se.getSuggestedUser().getIdentifier();
			}else{
				suggester = se.getSuggestedUser().getIdentifier();
			}
			
			if(se.getComment() != null){
				suggester += "(" + se.getComment() + ")"; 
			}
			
			endorsementMap.put(se.getSkill().getName(), suggester);
		}
		
		
		for (Iterator<String> iterator = endorsementMap.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println(key + " -- " + endorsementMap.get(key));
			
		}
	}
	
	public Collection<SkillEndorsement> getEndorsements() {
		if(endorsements == null){
			endorsements = new HashSet<SkillEndorsement>();
		}
		return endorsements;
	}
	public void setEndorsements(Collection<SkillEndorsement> endorsements) {
		this.endorsements = endorsements;
	}
	public void addEndorsements(SkillEndorsement... endorsement) {
		this.getEndorsements().addAll(Arrays.asList(endorsement));
	}
	
	
}
