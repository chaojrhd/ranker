package prototype;

public class SkillEndorsement {
	Skill skill;
	User suggestedUser;
	String comment;
	
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public User getSuggestedUser() {
		return suggestedUser;
	}
	public void setSuggestedUser(User suggestedUser) {
		this.suggestedUser = suggestedUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
