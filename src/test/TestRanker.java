package test;

import prototype.Profile;
import prototype.Skill;
import prototype.SkillEndorsement;
import prototype.User;


/**
 * Simple Tester to test the prototype
 * @author jamli
 *
 */
public class TestRanker {
	
	
	public static void main(String args[]){
		Profile buildProfile = buildProfile("田师傅", "13100001111");
		buildProfile.print();
	}

	private static Profile buildProfile(String string, String tel) {
		Profile profile = new Profile();
		profile.setIdentifier(string);
		profile.setTel(tel);
		
		User yue = new User("玥");
		User xin = new User("信");
		User user1 = new User("猪宝贝");
		User user2 = new User("小花卷");
		
		Skill skill1 = new Skill("铺地板");
		Skill skill2 = new Skill("镶踢角线");
		Skill skill3 = new Skill("吊灯");
		Skill skill4 = new Skill("刮大白");
		
		SkillEndorsement se1 = addEndorsement(yue, skill1);
		se1.setComment("专业的师傅, 质量非常好, 半天铺完, 房间收拾的非常干静");
		SkillEndorsement se2 = addEndorsement(xin, skill1);
		se2.setComment("工作质量相当不错.");
		SkillEndorsement se3 = addEndorsement(xin, skill2);
		se3.setComment("还可以, 希望转角的地方能收拾的更好一点.");
		SkillEndorsement se4 = addEndorsement(user1, skill2);
		SkillEndorsement se5 = addEndorsement(user2, skill2);
		SkillEndorsement se6 = addEndorsement(user1, skill3);
		SkillEndorsement se7 = addEndorsement(user1, skill4);
		SkillEndorsement se8 = addEndorsement(yue, skill4);
		
		profile.addEndorsements(se1,se2,se3,se4,se5,se6,se7,se8);
		return profile;
	}

	private static SkillEndorsement addEndorsement(User xin, Skill skill2) {
		SkillEndorsement se3 = new SkillEndorsement();
		se3.setSkill(skill2);
		se3.setSuggestedUser(xin);
		return se3;
	}
	
}
