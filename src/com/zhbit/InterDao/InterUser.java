package com.zhbit.InterDao;

import java.util.List;

import com.zhbit.entity.User;

public interface InterUser 
{
	int addUser(User user);//����Ա/�û�-->ע��
	boolean login(User user);//����Ա/�û�-->��¼
	User selectUserInfo(int id);//���Ҹ�����Ϣ
	List findAllUsers();//����Ա/�û�  --> �鿴�����û�
    List findNewUsers();//����Ա�鿴�����û�
    int modifyUserInfo(User user);//����Ա�޸��û���Ϣ
    int deleteUser(int id);//����Աɾ���û�
    List findAllAdmins();//����Ա�鿴���й���Ա��Ϣ
    int addAdmin(User user);//����Ա-->��ӹ���Ա
    //int modifyAdmin(User user);//����Ա-->�޸Ĺ���Ա��Ϣ
    // int deleteAdmin(int id);//����Ա-->ɾ������Ա
    int getUserid(String username,String password);
    int getUserroleId(int id);
    boolean isExistUsername(String username);  //�ж��û��Ƿ����
    boolean changePassword(String password);   //�޸�����
    
    
}
