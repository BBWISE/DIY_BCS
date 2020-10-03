package DIY_BCS;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Main extends JFrame {
	JPanel MasterPanel = new JPanel();
	JPanel WelcomePanel = new JPanel();
	JPanel RegistrationPanel = new JPanel();
	JPanel Dashboard = new JPanel();
	JPanel tipsPanel = new JPanel();
	JPanel SDTestPanel = new JPanel();
	JPanel nippleDischarges1 = new JPanel(new GridLayout(5,1));
	JPanel skinChanges1 = new JPanel(new GridLayout(8,1));
	JPanel nNursingP = new JPanel(new GridLayout(2,1));
	
	JLabel name = new JLabel();
	
	JButton proceed = new JButton("Proceed");
	JButton back1 = new JButton("Previous");
	JButton submit = new JButton("Submit");
	JButton tips = new JButton();
	JButton start = new JButton();
	JButton settings = new JButton("Settings");
	JButton back2 = new JButton();
	JButton SDBack = new JButton();
	JButton PEButton = new JButton("Physical Test");
	JButton CTButton = new JButton("Clinical Test");
	JButton PTNext = new JButton("Next >>");
	JButton result = new JButton("Check Result");
	JButton howTo = new JButton("Tips");
	JButton skip = new JButton("Skip");
	
	JTextArea GMS = new JTextArea();
	
	JTextField firstName = new JTextField("First name", 15);
	JTextField lastName = new JTextField("Last name", 15);
	JTextField age = new JTextField("Age",15);
	JTextField country = new JTextField("Country",15);
	JTextField ageMenarche = new JTextField("Age at menarche");
	JTextField ageFirstDelivery = new JTextField("Age at first delivery");
	JTextField nNursing = new JTextField("3");
	
	JComboBox bPain = new JComboBox(new Object []{"Do you noticed any breast pain?","Yes","No"});
	JComboBox bPain1 = new JComboBox(new Object []{"Do you noticed any breast pain?","Yes","No"});
	JComboBox nDischarge = new JComboBox(new Object[] {"Do you noticed any \'Nipple discharge\' from the Breast?","Yes","No"});
	JComboBox sRetraction = new JComboBox(new Object[] {"Do you notice any \'Skin retration\' around the breast?","Yes","No"});
	JComboBox aSwelling = new JComboBox(new Object[] {"Do you ever notice any irrelevant arm swelling?","Yes","No"});
	JComboBox bShape = new JComboBox(new Object[] {"Do you notice any sudden change in breast shape?","Yes","No"});
	JComboBox fHistory = new JComboBox(new Object[] {"Do you have any Family history of breast and other cancers with emphasis on gynaecological cancers","Yes","No"});
	JComboBox nChildren = new JComboBox(new Object[] {"Are you currently breast-feeding for the very first time?","Yes","No"});
	JComboBox cPill = new JComboBox(new Object[] {"Do you use contraceptive pills?","Yes","No"});
	JComboBox breastWeight = new JComboBox(new Object[] {"Does the Breast feel heavy?","Yes","No"});
	JComboBox breastSize = new JComboBox(new Object[] {"Do you noticed any change in Breast size?","Yes","No"});
	JComboBox breastShape = new JComboBox(new Object[] {"Do you noticed any change in Breast shape?","Yes","No"});
	JComboBox breastSkin = new JComboBox(new Object[] {"Do you noticed any fixation to skin, pectoral muscle and chest wall?","Yes","No"});
	JComboBox breastNipple = new JComboBox(new Object[] {"Do you noticed any nipple changes?","Yes","No"});
	JComboBox arm_swelling = new JComboBox(new Object[] {"Do you noticed any arm swelling?","Yes","No"});
	JComboBox period = new JComboBox(new Object[] {"Are you on menstrual period?","Yes","No"});
	JComboBox familyHistory = new JComboBox(new Object[] {"Any Family history of breast or other cancer related disease?","Yes","No"});
	JComboBox pregnancy = new JComboBox(new Object[] {"Are you Pregnant?","Yes","No"});
	JComboBox nursing = new JComboBox(new Object[] {"Do you nurse a baby presently?","Yes","No"});
	
	JCheckBox discharge1 = new JCheckBox(" Retraction");
	JCheckBox discharge2 = new JCheckBox(" Erythema (Redish Discharge)");
	JCheckBox discharge3 = new JCheckBox(" Erosion and ulceration");
	JCheckBox discharge4 = new JCheckBox(" Bloody");
	
	JCheckBox skinChange1 = new JCheckBox(" Erythema (Skin redness)");
	JCheckBox skinChange2a = new JCheckBox(" Oedema i (Skin swelling in part of breast)");
	JCheckBox skinChange2b = new JCheckBox(" Oedema ii (Skin swelling arround the breast)");
	JCheckBox skinChange3 = new JCheckBox(" Dimpling");
	JCheckBox skinChange4 = new JCheckBox(" Infiltration");
	JCheckBox skinChange5 = new JCheckBox(" Ulceration (Open wound on the Breast skin)");
	JCheckBox skinChange6 = new JCheckBox(" Satellite nodules (Presence of boil-like infection)");
	JCheckBox skinChange7 = new JCheckBox(" Thickening");
	JCheckBox skinChange8 = new JCheckBox(" Peeling, Scalling or flasking of skin on nipple or breast");
	
	CardLayout MasterCard = new CardLayout();
	CardLayout SDMasterCard = new CardLayout();
	
	public static String FirstName, LastName, Country;
	public static String username;
	public static int Age,AMenarche,AFDelivery, NChildren;
	
	Handler handler = new Handler();
	
	ImageIcon InfectedBreastScan = new ImageIcon("Images/InfectedBreastScan.PNG");
	ImageIcon stage1 = new ImageIcon("Images/Stage 1.PNG");
	ImageIcon stage2 = new ImageIcon("Images/Stage 2.PNG");
	ImageIcon stage3 = new ImageIcon("Images/Stage 3.PNG");
	ImageIcon figure5 = new ImageIcon("Images/Infected Breast.PNG");
	ImageIcon mLogo = new ImageIcon("Images/Medical Blue2.JPG");
	ImageIcon welcome = new ImageIcon("Images/Welcome.PNG");
	ImageIcon welcomeSD = new ImageIcon("Images/self diagnose.PNG");
	ImageIcon diybcs = new ImageIcon("Images/DIYBCS.PNG");
	ImageIcon diybcs2 = new ImageIcon("Images/DIYBCS.PNG");
	ImageIcon startButton = new ImageIcon("Images/aStart.gif");
	ImageIcon Set = new ImageIcon("Images/Set.PNG");
	ImageIcon sdback = new ImageIcon("Images/back.PNG");
	ImageIcon DBback = new ImageIcon("Images/back.PNG");
	ImageIcon CTB = new ImageIcon("Images/cnt.PNG");
	ImageIcon PTB = new ImageIcon("Images/pnt.PNG");
	ImageIcon np1 = new ImageIcon("Images/np1.PNG");
	ImageIcon np2 = new ImageIcon("Images/np2.PNG");
	ImageIcon np3 = new ImageIcon("Images/np3.PNG");
	ImageIcon np4 = new ImageIcon("Images/np4.PNG");
	ImageIcon np5 = new ImageIcon("Images/np5.PNG");
	ImageIcon np6 = new ImageIcon("Images/np6.PNG");
	ImageIcon np7 = new ImageIcon("Images/np7.PNG");
	ImageIcon np8 = new ImageIcon("Images/np8.PNG");
	ImageIcon np9 = new ImageIcon("Images/np9.PNG");
	ImageIcon goodResult = new ImageIcon("Images/Result1.PNG");
	ImageIcon seal1 = new ImageIcon("Images/seel.PNG");	
	
	JScrollPane skinChanges = new JScrollPane(skinChanges1);
	JScrollPane nippleDischarges = new JScrollPane(nippleDischarges1);
	
	File profile = new File("profile/profile.txt");
	File WindowWelcomingText = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\StartUp\\DIY_BCSWT.vbs");
	File profile2 = new File("profile/DIY_BCSWT.vbs");
	
	public void saver() throws Exception {
		
		PrintWriter fSend = new PrintWriter(profile);
		PrintWriter fSend2 = new PrintWriter(profile2);
		//PrintWriter fSend3 = new PrintWriter(WindowWelcomingText);
		if(profile.exists()) {
		fSend.print(FirstName + " "+ LastName+" "+Age+" "+Country+" "+" "+AMenarche+" "+AFDelivery);	fSend.close();
		fSend2.print("x=msgbox(\"Hi  "+FirstName+" "+LastName+"!                                                                                                                    We do like to inform you that \'HEALTH IS WEALTH\'. Check your Medical Status now for quick and better improvement.                                                                           We await to see you soon.       Thanks!                                                                                                                     DIY_BCS\",0+45,\"DIY_BCS Message\")"); fSend2.close();		
		//fSend3.print("x=msgbox(\"Hi  "+FirstName+" "+LastName+"!                                                                                                                    We do like to inform you that \'HEALTH IS WEALTH\'. Check your Medical Status now for quick and better improvement.                                                                           We await to see you soon.       Thanks!                                                                                                                     DIY_BCS\",0+45,\"DIY_BCS Message\")"); fSend3.close();
		
		
		}
		
		
	}
	public void loader() throws FileNotFoundException {
		Scanner scan = new Scanner(profile);
		System.out.println("Scanner activated");
		
		while (scan.hasNext()) {
		FirstName= scan.next();
		LastName = scan.next();
		Age = scan.nextInt();
		Country = scan.next();
		AMenarche = scan.nextInt();
		AFDelivery = scan.nextInt();
		
		name.setText(FirstName+" "+LastName);
		}
		
		
		
		System.out.println(FirstName+" "+"LastName"+" "+Country+" "+Age);
		
		scan.close();
	}
	
	public void WorkFrame() {
		MasterPanel.setLayout(MasterCard);
//BUTTONS HANDLER		
		proceed.addActionListener(handler);
		back1.addActionListener(handler);
		back2.addActionListener(handler);
		submit.addActionListener(handler);
		start.addActionListener(handler);
		tips.addActionListener(handler);
		settings.addActionListener(handler);
		SDBack.addActionListener(handler);
		PEButton.addActionListener(handler);
		CTButton.addActionListener(handler);
		PTNext.addActionListener(handler);
		result.addActionListener(handler);
		howTo.addActionListener(handler);
		skip.addActionListener(handler);
		
		
		
		
//COMPONETS FONT SIZES
		firstName.setFont(new Font("Calibril",Font.PLAIN,14));
		lastName.setFont(new Font("Calibril",Font.PLAIN,14));
		age.setFont(new Font("Calibril",Font.PLAIN,14));
		country.setFont(new Font("Calibril",Font.PLAIN,14));
		bPain.setFont(new Font("Calibril",Font.PLAIN,14));
		nDischarge.setFont(new Font("Calibril",Font.PLAIN,14));
		sRetraction.setFont(new Font("Calibril",Font.PLAIN,14));
		aSwelling.setFont(new Font("Calibril",Font.PLAIN,14));
		bShape.setFont(new Font("Calibril",Font.PLAIN,14));
		fHistory.setFont(new Font("Calibril",Font.PLAIN,14));
		ageMenarche.setFont(new Font("Calibril",Font.PLAIN,14));
		ageFirstDelivery.setFont(new Font("Calibril",Font.PLAIN,14));
		nChildren.setFont(new Font("Calibril",Font.PLAIN,14));
		cPill.setFont(new Font("Calibril",Font.PLAIN,14));
		result.setFont(new Font("Calibril",Font.BOLD,14));
		
		
		
		
//WELCOMING PAGE		
		JPanel goPanel = new JPanel();
		goPanel.setLayout(new BorderLayout());
		goPanel.add(new JLabel("Please ensure that you have read and understand the above information"),BorderLayout.CENTER);
		goPanel.add(proceed,BorderLayout.EAST);
		goPanel.add(new JLabel(" "),BorderLayout.SOUTH);
		JPanel ww = new JPanel();
		ww.setLayout(new FlowLayout(FlowLayout.CENTER));
		ww.add(new JLabel("WELCOME TO DIY_BCS"));
		JPanel IntroPanel = new JPanel();
		JPanel pixsPanel = new JPanel();
		pixsPanel.setLayout(new GridLayout(5,1,0,0));
		IntroPanel.setLayout(new BorderLayout());
		
		JTextArea welcomingSpeech = new JTextArea("					DIY_BCS\n   \'DIY_BCS\' is an acronym for \"Do It Yourself Breast Cancer Solution\" which guides every user and provides solutions on the effect of Breast Cancer.\n\n       Introduction to Breast Cancer\n\nWhat is breast cancer?\n   Breast cancer is characterised by the uncontrolled growth of abnormal cells in the milk producing glands of the breast or in the passages (ducts) that deliver milk to the nipples. We can also say that Breast cancer is a type of cancer that starts in the breast when cells begin to grow out of control.\nBreast cancer cells usually form a tumor that can often be seen on an x-ray or felt as a lump.  See Figure 1.\n\nThe American Cancer Society's estimates for breast cancer in the United States for 2020 are:\n      About 276,480 new cases of invasive breast cancer will be diagnosed in women.\n      About 48,530 new cases of carcinoma in situ (CIS) will be diagnosed (CIS is noninvasive and is the earliest form of breast cancer).\n\n   Breast cancer survivors\n At this time there are more than 3.5 million breast cancer survivors in the United States. This includes women still being treated and those who have completed treatment.\n\nNote that:\n   Breast cancers can start from different parts of the breast. Most breast cancers begin in the ducts that carry milk to the nipple (ductal cancers). Some start in the glands that make breast milk (lobular cancers). Doctors know that Breast Cancr occurs when some breast cells begin togrow abnormally. These cells divide more rapidly than healthy cells do and continue to accumulate, forming a lump or mass. Cells may spread (Metastasize) through your breast to your lymph nodes or to other parts of your body.\n\n TYPES OF BREAST CANCER\n   The type of breast cancer is important in determining the most effective treatment approach.\n 1.   Hormone Receptor-Positive Breast Cancer:\n   This type of cancer grows in response to the hormones oestrogen and progesterone, and as such is likely to respond to therapies that aim to inhibit the growth effects of hormones.\n\n 2.   HER2-positive breast cancer:\n   This is another type of Breast Cancer which is typified by cells that make too much of a protein known as HER2/neu. It represents 20–30% of Hormone Receptor - Positive breast cancers. Tumours that do not overexpress HER2/neu are described as HER2-negative. \n\n 3.   Triple negative breast cancer (TNBC) is a rarer form of breast cancer which is a sub-type of HER2-negative disease. TNBC refers to tumour cells which lack oestrogen and progesterone receptors, and do not overexpress the HER2 protein. This cancer type accounts for around 15% of all breast cancers, and is usually more aggressive and difficult to treat as it does not tend to respond to standard therapies.5,7 Due to the aggressive nature of this disease it is important to treat patients early; however with few effective treatments available there is a high unmet medical need.\n\n CAUSES OF BREAST CANCER\n\n i)   Age: The majority of breast cancer cases occur in women over the age of 50.\n ii)   Family history: If a woman has a personal or family history of breast cancer she is at increased risk of developing breast cancer.\n iii)   A late first pregnancy: Women who have a late first pregnancy (after the age of 35) are more likely to develop breast cancer.\n iv)   Lifestyle factors: For example, being overweight or obese after the menopause, physical inactivity, a high fat diet and high alcohol consumption can play an important role in the development of breast cancer.\n\n  STAGING OF BREAST CANCER\n\n i)   Early stage: This is refers to cancer that is confined to the fatty tissue of the breast.   see Figure 2.\n ii)   Locally advanced: At this stage it has spread to underlying tissue of the chest wall.   see Figure 3.\n iii)   Advanced or metastatic: At this particular stage the tumour has spread to other parts of the body. Approximately one third of breast cancer cases are diagnosed after the cancer has spread beyond the primary tumour site (metastasised).   see Figure 3.\n\n   EARLY SIGNS OF BREAST CANCER\n     1.  Skin changes such as swelling, redness, or other visible difference in one or both breast.\n     2.   An increase in size or change in shape of breast(s).\n     3.   Changes in the appearance of one or both nipples\n     4.   Nipple discharge other than breast milk.\n                 see figure 5.\n\n  WARNING SIGNS OF BREAST CANCER\n    1)   New lump in the breast or underarm.\n    2)   Thickening or swelling of part of the breast.\n    3)   Irritation or dimpling of breast skin.\n    4)   Redness or flaty skin in the nipple area or the breast\n    5)   Pulling in of the nipple or plain in the nipple area.\n    6)   Nipple discharge other than breast milk, including blood.\n\n  MEDICAL CONDITION\n    This doubles the risk of developing lung cancer, the second most common cancer in women. It is almost impossible to predict how long an individual patient might live, but 5 years survival rates can give an approximate range. The 5 years survival rate describes on average the ‘amount’ of people that will be alive 5 years after diagnosis. The average 5 year survival rate for women with early stage breast cancer is 81%. However, on average only 35% of women with late or advanced stage breast cancer currently survive for 5 years.\n\n  TREATMENT\n    Breast cancer treatment options vary depending on the stage of the cancer – its size, position, whether it has spread to other parts of the body and the physical health of the patient. Current treatments for breast cancer include surgery, radiotherapy, chemotherapy, hormonal and targeted therapies. These therapies may be used alone or in combination depending on the stage of the disease.");
		
		pixsPanel.add(new JLabel(InfectedBreastScan));
		pixsPanel.add(new JLabel(stage1));
		pixsPanel.add(new JLabel(stage2));
		pixsPanel.add(new JLabel(stage3));
		pixsPanel.add(new JLabel(figure5));
		
		
		
		welcomingSpeech.setEditable(false);
		welcomingSpeech.setFont(new Font("Calibril",Font.PLAIN,14));
		welcomingSpeech.setLineWrap(true);
		welcomingSpeech.setWrapStyleWord(true);
		
		IntroPanel.add(welcomingSpeech,BorderLayout.CENTER);
		IntroPanel.add(pixsPanel,BorderLayout.EAST);
		
		JScrollPane scrol = new JScrollPane(IntroPanel);
		WelcomePanel.setLayout(new BorderLayout());
		WelcomePanel.add(ww, BorderLayout.NORTH);
		WelcomePanel.add(goPanel, BorderLayout.SOUTH);
		WelcomePanel.add(scrol, BorderLayout.CENTER);
		
//REGISTRATION PAGE
		RegistrationPanel.setLayout(new BorderLayout());
		RegistrationPanel.add(new JLabel("Registration"),BorderLayout.NORTH);
		JPanel mid = new JPanel();
		mid.setLayout(new GridLayout(20,1,4,4));
		JPanel headingP = new JPanel(new GridLayout(3,3));
		headingP.add(new JLabel(""));
		JLabel yaw = new JLabel("You are welcome");
		yaw.setFont(new Font("Calibril",Font.BOLD,16));
		headingP.add(yaw);
		headingP.add(new JLabel(""));
		headingP.add(new JLabel("DIY_BCS likes to know more about you !"));
		headingP.add(new JLabel(""));
		headingP.add(new JLabel(""));
		JLabel ll = new JLabel("Personal Informations");
		ll.setForeground(Color.blue);
		ll.setFont(new Font("Calibril",Font.BOLD,16));
		headingP.add(ll);
		JPanel CliP = new JPanel();
		JLabel Cli = new JLabel("Clinical Examination");
		Cli.setFont(new Font("Calibril",Font.BOLD,16));
		Cli.setForeground(new Color(250,25,250));
		CliP.add(Cli, BorderLayout.WEST);
		CliP.add(new JLabel(" "));
		CliP.add(new JLabel("Presenting symptoms:"),BorderLayout.SOUTH);
		JPanel CliP2 = new JPanel();
		JLabel Cli2 = new JLabel("Physical Examination");
		Cli2.setFont(new Font("Calibril",Font.BOLD,16));
		Cli2.setForeground(new Color(250,25,250));
		CliP2.add(Cli2, BorderLayout.WEST);
		CliP2.add(new JLabel(" "));
		CliP2.add(new JLabel(""),BorderLayout.SOUTH);
		JPanel CliP3 = new JPanel();
		JLabel Cli3 = new JLabel("Clinical Examination");
		Cli3.setFont(new Font("Calibril",Font.BOLD,16));
		Cli3.setForeground(new Color(250,25,250));
		CliP3.add(Cli3, BorderLayout.WEST);
		CliP3.add(new JLabel(" "));
		CliP3.add(new JLabel("Reproductive history:"),BorderLayout.SOUTH);
		
		
		mid.add(headingP);
		mid.add(firstName);
		mid.add(lastName);
		mid.add(age);
		mid.add(country);
		mid.add(CliP2);
		mid.add(nDischarge);
		mid.add(sRetraction);
		mid.add(aSwelling);
		mid.add(bShape);
		mid.add(CliP);
		mid.add(bPain);
		mid.add(fHistory);
		mid.add(CliP3);
		mid.add(ageMenarche);
		mid.add(ageFirstDelivery);
		mid.add(nChildren);
		mid.add(cPill);
		
		
		JPanel low = new JPanel();
		low.setLayout(new BorderLayout());
		low.add(back1,BorderLayout.WEST);
		low.add(submit,BorderLayout.EAST);
		low.add(new JLabel(" "),BorderLayout.SOUTH);
		
		JScrollPane scrol2 = new JScrollPane(mid);
		RegistrationPanel.add(scrol2,BorderLayout.CENTER);
		RegistrationPanel.add(low, BorderLayout.SOUTH);
		
		
		
//HEALTH TIPS
		tipsPanel.setLayout(new BorderLayout());
		
		JTextArea tipsText = new JTextArea("      What to know about cancer\n   Cancer causes cells to divide uncontrollably. This can result in tumors, damage to the immune system, and other impairment that can be fatal.\n   In the United States, an estimated 15.5 million people with a history of cancer were living as of January 1, 2016, according to a 2018 report from the American Cancer Society.\n   In this article, we examine types of cancer, how the disease develops, and the many treatments that help improve the quality of life and survival rates.\n   Cancer is a broad term. It describes the disease that results when cellular changes cause the uncontrolled growth and division of cells.\n   Some types of cancer cause rapid cell growth, while others cause cells to grow and divide at a slower rate.\n   Certain forms of cancer result in visible growths called tumors, while others, such as leukemia, do not.\n   Most of the body’s cells have specific functions and fixed lifespans. While it may sound like a bad thing, cell death is part of a natural and beneficial phenomenon called apoptosis.\n   A cell receives instructions to die so that the body can replace it with a newer cell that functions better. Cancerous cells lack the components that instruct them to stop dividing and to die.\n   As a result, they build up in the body, using oxygen and nutrients that would usually nourish other cells. Cancerous cells can form tumors, impair the immune system and cause other changes that prevent the body from functioning regularly.\n   Cancerous cells may appear in one area, then spread via the lymph nodes. These are clusters of immune cells located throughout the body.\n\n  Causes\n  There are many causes of cancer, and some are preventable.\n   For example, over 480,000 people die in the U.S. each year from smoking cigarettes, according to data reported in 2014.\n   In addition to smoking, risk factors for cancer include:\n   \b  Heavy alcohol consumption\n   \b  Excess body weight\n   \b  Physical inactivity\n   \b  Poor nutrition\n\n   Other causes of cancer are not preventable. Currently, the most significant unpreventable risk factor is age. According to the American.\n\n   Is cancer genetic?\n   Genetic factors can contribute to the development of cancer.\n   A person’s genetic code tells their cells when to divide and expire.\n   Changes in the genes can lead to faulty instructions, and cancer can result.\n   Genes also influence the cells’ production of proteins, and proteins carry many of the instructions for cellular growth and division.\n   Some genes change proteins that would usually repair damaged cells.\n   This can lead to cancer. If a parent has these genes, they may pass on the altered instructions to their offspring.\n   Some genetic changes occur after birth, and factors such as smoking and sun exposure can increase the risk.\n   Other changes that can result in cancer take place in the chemical signals that determine how the body deploys, or “expresses” specific genes.\n   Finally, a person can inherit a predisposition for a type of cancer. A doctor may refer to this as having a hereditary cancer syndrome. Inherited genetic mutations significantly contribute to the development of 5–10 percent of cancer cases.\n\n   Treatments\n   Innovative research has fueled the development of new medications and treatment technologies.\n   Doctors usually prescribe treatments based on the type of cancer, its stage at diagnosis, and the person’s overall health.\n   Below are examples of approaches to cancer treatment:\n   \b  Chemotherapy aims to kill cancerous cells with medications that target rapidly dividing cells. The drugs can also help shrink tumors, but the side effects can be severe.\n   \b  Hormone therapy involves taking medications that change how certain hormones work or interfere with the body’s ability to produce them. When hormones play a significant role, as with prostate and breast cancers, this is a common approach.\n   \b  Immunotherapy uses medications and other treatments to boost the immune system and encourage it to fight cancerous cells. Two examples of these treatments are checkpoint inhibitors and adoptive cell transfer.\r\n   \b  Precision medicine, or personalized medicine, is a newer, developing approach. It involves using genetic testing to determine the best treatments for a person’s particular presentation of cancer. Researchers have yet to show that it can effectively treat all types of cancer, however.\n   \b  Radiation therapy uses high-dose radiation to kill cancerous cells. Also, a doctor may recommend using radiation to shrink a tumor before surgery or reduce tumor-related symptoms.\n   \b  Stem cell transplant can be especially beneficial for people with blood-related cancers, such as leukemia or lymphoma. It involves removing cells, such as red or white blood cells, that chemotherapy or radiation has destroyed. Lab technicians then strengthen the cells and put them back into the body.\n   \b  Surgery is often a part of a treatment plan when a person has a cancerous tumor. Also, a surgeon may remove lymph nodes to reduce or prevent the disease’s spread.\n  \b  Targeted therapies perform functions within cancerous cells to prevent them from multiplying. They can also boost the immune system. Two examples of these therapies are small-molecule drugs and monoclonal antibodies.\n   Notes that Doctors will often employ more than one type of treatment to maximize effectiveness.\n\n   TYPES\n   The most common type of cancer in the U.S. is breast cancer, followed by lung and prostate cancers, according to the National Cancer Institute, which excluded nonmelanoma skin cancers from these findings.\n   \b  Bladder\n   \b  Colon and rectal\n   \b  Endometrial\n   \b  Kidney\n   \b  Leukemia\n   \b  Liver\n   \b  Melanoma\n   \b  Non-Hodgkin’s lymphoma\n   \b  Thyroid.\n   Other forms are less common. According to the National Cancer Institute, there are over 100 types of cancer.\n\n   Symptoms of Cancer\n   Cancer can cause many symptoms, but these symptoms are most often caused by illness, injury, benign tumors, or other problems. If you have symptoms that do not get better after a few weeks, see your doctor so that problems can be diagnosed and treated as early as possible. Often, cancer does not cause pain, so do not wait to feel pain before seeing a doctor.\n   Some of the symptoms that cancer may cause include:\n\n   Breast changes\n     \b  Lump or firm feeling in your breast or under your arm\n     \b  Nipple changes or discharge\n     \b  Skin that is itchy, red, scaly, dimpled, or puckered.\n   Bladder changes\n     \b  Trouble urinating\r\n     \b  Pain when urinating\n     \b  Blood in the urine.\n   Bleeding or bruising, for no known reason.\n   Bowel changes\n     \b   Blood in the stools\n     \b  Changes in bowel habits.\n   Cough or hoarseness that does not go away.\n   Eating problems\n     \b  Pain after eating (heartburn or indigestion that doesn’t go away)\n     \b  Trouble swallowing\r\n     \b  Belly pain\r\n     \b  Nausea and vomiting\r\n     \b  Appetite changes.\n   Fatigue that is severe and lasts.\n   Fever or night sweats for no known reason.\n   Mouth changes\n     \b  A white or red patch on the tongue or in your mouth\n     \b  Bleeding, pain, or numbness in the lip or mouth.\n   Neurological problems\n     \b  Headaches\n     \b  Seizures\n     \b  Vision changes\n     \b  Hearing changes\n     \b  Drooping of the face.\n   Skin changes\n     \b  A flesh-colored lump that bleeds or turns scaly\n     \b  A new mole or a change in an existing mole\n     \b  A sore that does not heal\n     \b  Jaundice (yellowing of the skin and whites of the eyes).\n   Swelling or lumps anywhere such as in the neck, underarm, stomach, and groin.\n   Weight gain or weight loss for no known reason.\n\n");
		JTextField tipsTextQ = new JTextField("QUESTION:           How do I recognize cancer before it starts to cause serious health problems?");
		tipsTextQ.setBackground(new Color(250,180,25));
		tipsTextQ.setFont(new Font("Calibril",Font.BOLD,14));
		tipsTextQ.setEditable(false);
		
		JTextArea tipsTextA = new JTextArea("\nANSWER.\n   Some cancers cause early symptoms, but others do not exhibit symptoms until they are more advanced. Many of these symptoms are often from causes unrelated to cancer.\n   The best way to identify cancer early is to report any unusual, persistent symptoms to your doctor so they can advise you on any further testing that may be needed.\n");
		tipsTextA.setBackground(Color.GREEN);
		tipsTextA.setFont(new Font("Calibril",Font.BOLD,14));
		tipsTextA.setEditable(false);
		tipsTextA.setLineWrap(true);
		tipsTextA.setWrapStyleWord(true);
		
		JPanel tipsTextQA = new JPanel(new BorderLayout());
		tipsTextQA.add(tipsTextQ,BorderLayout.NORTH);
		tipsTextQA.add(tipsTextA,BorderLayout.CENTER);
		tipsTextQA.add(new JLabel(" "),BorderLayout.SOUTH);
		
		
		tipsText.setLineWrap(true);
		tipsText.setFont(new Font("Calibril",Font.PLAIN,14));
		tipsText.setWrapStyleWord(true);
		tipsText.setEditable(false);
		JPanel tipsTextP = new JPanel(new BorderLayout());
		
		tipsTextP.add(tipsText,BorderLayout.CENTER);
		tipsTextP.add(tipsTextQA,BorderLayout.SOUTH);
		JScrollPane tipsScroll = new JScrollPane(tipsTextP);
		
		JPanel TTipsP = new JPanel();
		TTipsP.setLayout(new BorderLayout());
		JLabel TTips = new JLabel("HEALTH TIPS");
		TTips.setFont(new Font("Calibril",Font.BOLD,18));
		JPanel TTipsp = new JPanel();
		TTipsp.add(TTips);
		TTipsP.add(back2,BorderLayout.WEST);
		TTipsP.add(TTipsp,BorderLayout.CENTER);
		
		JPanel backP = new JPanel();
		back2.setIcon(DBback);
		back2.setBorderPainted(false);
		back2.setBackground(new Color(239,239,245));
		backP.setLayout(new BorderLayout());
		
		tipsPanel.add(TTipsP,BorderLayout.NORTH);
		tipsPanel.add(tipsScroll,BorderLayout.CENTER);
		tipsPanel.add(backP,BorderLayout.SOUTH);
		
		
		
		
//SELF DIAGNOSE
		JPanel SD = new JPanel();
		SD.setLayout(new BorderLayout());
		JPanel sdTop = new JPanel();
		sdTop.setBackground(new Color(25,250,200));
		sdTop.setLayout(new BorderLayout());
		sdTop.add(new JLabel(diybcs2), BorderLayout.NORTH);
		sdTop.add(new JLabel(welcomeSD),BorderLayout.CENTER);
		SDTestPanel.setLayout(SDMasterCard);
		
		JPanel sdLeft = new JPanel();
		sdLeft.setLayout(new GridLayout(10,1,4,0));
		JPanel sdBackP = new JPanel();
		sdBackP.setLayout(new BorderLayout());
		SDBack.setBackground(new Color(239,239,245));
		SDBack.setBorderPainted(false);
		SDBack.setIcon(sdback);
		sdBackP.add(SDBack,BorderLayout.WEST);
		CTButton.setIcon(CTB);
		PEButton.setIcon(PTB);
		sdLeft.add(sdBackP);
		sdLeft.add(howTo);
		sdLeft.add(PEButton);
		sdLeft.add(CTButton);
		
		
		
	//PHYSICAL TEST
		JPanel physicalTestP = new JPanel();
		physicalTestP.setBackground(new Color(250,250,250));
		physicalTestP.setLayout(new GridLayout(10,1));
		
		JPanel physicalTestTopP = new JPanel();
		physicalTestTopP.setBackground(new Color(250,250,250));
		physicalTestTopP.add(new JLabel("Your Physical Test starts now."));
		physicalTestP.add(physicalTestTopP);
		physicalTestP.add(bPain1);
		physicalTestP.add(breastWeight);
		physicalTestP.add(breastSize);
		physicalTestP.add(breastShape);
		physicalTestP.add(arm_swelling);
		physicalTestP.add(breastSkin);
		physicalTestP.add(breastNipple);
		physicalTestP.add(nursing);
		JPanel physicalTestDownP = new JPanel();
		physicalTestDownP.setLayout(new FlowLayout(FlowLayout.RIGHT,3,3));
		physicalTestDownP.add(PTNext);
		physicalTestDownP.setBackground(new Color(250,250,250));
		physicalTestP.add(physicalTestDownP);
		
	//CLINICAL TEST
		JPanel clinicalTest = new JPanel();
		clinicalTest.setBackground(new Color(250,250,250));
		clinicalTest.setLayout(new GridLayout(8,1));
		
		JPanel clinicalTestTopP = new JPanel(new FlowLayout(FlowLayout.CENTER));
		clinicalTestTopP.setBackground(new Color(250,250,250));
		clinicalTestTopP.add(new JLabel("This is the Clinical Test page."));
		
		JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		result.setBackground(Color.green);
		resultPanel.add(result);
		
		nippleDischarges1.setBackground(Color.white);
		nippleDischarges1.add(new JLabel("How can you describe the noticed discharge?"));
		nippleDischarges1.add(discharge1);
		nippleDischarges1.add(discharge2);
		nippleDischarges1.add(discharge3);
		nippleDischarges1.add(discharge4);
		
		skinChanges1.setBackground(Color.white);
		skinChanges1.add(new JLabel("How can you describe the change of skin?"));
		skinChanges1.add(skinChange1);
		skinChanges1.add(skinChange2a);
		skinChanges1.add(skinChange2b);
		skinChanges1.add(skinChange3);
		skinChanges1.add(skinChange4);
		skinChanges1.add(skinChange5);
		skinChanges1.add(skinChange6);
		
		nippleDischarges.setVisible(false);
		skinChanges.setVisible(false);
		nNursingP.add(new JLabel("What number of Child are you nursing?"));
		nNursingP.add(nNursing);
		
		clinicalTest.add(clinicalTestTopP);
		clinicalTest.add(period);
		clinicalTest.add(familyHistory);
		clinicalTest.add(pregnancy);
		clinicalTest.add(nNursingP);
		clinicalTest.add(skinChanges);
		clinicalTest.add(nippleDischarges);
		clinicalTest.add(resultPanel);
		
	//TIPS
		JPanel tip1 = new JPanel(new GridLayout(1,2));
		JPanel tip2 = new JPanel(new GridLayout(1,2));
		JPanel tip3 = new JPanel(new GridLayout(1,2));
		JPanel tip4 = new JPanel(new GridLayout(1,2));
		JPanel tip5 = new JPanel(new GridLayout(1,2));
		JPanel tip6 = new JPanel(new GridLayout(1,2));
		JPanel tip7 = new JPanel(new GridLayout(1,2));
		JPanel tip8 = new JPanel(new GridLayout(1,2));
		JPanel tip9 = new JPanel(new GridLayout(1,2));
		tip1.setBackground(Color.white);tip2.setBackground(Color.white);tip3.setBackground(Color.white);tip4.setBackground(Color.white);tip5.setBackground(Color.white);tip6.setBackground(Color.white);tip7.setBackground(Color.white);tip8.setBackground(Color.white);tip9.setBackground(Color.white);
		
		JTextArea n1 = new JTextArea("Note that this Self check/test is to be carried \nout once in a month and not too often.");
		n1.setFont(new Font("Calibril",Font.PLAIN,16));
		n1.setEditable(false);
		tip1.add(n1);
		tip1.add(new JLabel(np1));
		JTextArea n2 = new JTextArea("Examine the entire breast and the armpit area \nby lifting up and down your arm for 4/5 seconds.");
		n2.setFont(new Font("Calibril",Font.PLAIN,16));
		n2.setEditable(false);
		tip2.add(n2);
		tip2.add(new JLabel(np2));
		JTextArea n3 = new JTextArea("Now, at this stage you we need to introduce \nthe gently use of pads of your fingertips.");
		n3.setFont(new Font("Calibril",Font.PLAIN,16));
		n3.setEditable(false);
		tip3.add(n3);
		tip3.add(new JLabel(np3));
		JTextArea n4 = new JTextArea("Gently press-down the mentioned breast from \nthe top/upper part for about 4 to 5 seconds.\n\nNow press-up the breast with same interval.\n\nLastly, use your two hands to press the said breast\ntogether (Up and Down).");
		n4.setFont(new Font("Calibril",Font.PLAIN,16));
		n4.setEditable(false);
		tip4.add(n4);
		tip4.add(new JLabel(np4));
		JTextArea n5 = new JTextArea("Examine the entire breast by gently rubbing \nit for 4/5 seconds towards the other breast.");
		n5.setFont(new Font("Calibril",Font.PLAIN,16));
		n5.setEditable(false);
		tip5.add(n5);
		tip5.add(new JLabel(np5));
		JTextArea n6 = new JTextArea("Examine the entire breast gently rubbing\nthe said breast round a circle for 4/5 seconds.");
		n6.setFont(new Font("Calibril",Font.PLAIN,16));
		n6.setEditable(false);
		tip6.add(n6);
		tip6.add(new JLabel(np6));
		JTextArea n7 = new JTextArea("Check if there are/is any visual lumps by facing \nthe mirror (Look through the mirror).");
		n7.setFont(new Font("Calibril",Font.PLAIN,16));
		n7.setEditable(false);
		tip7.add(n7);
		tip7.add(new JLabel(np7));
		JTextArea n8 = new JTextArea("Check for any skin changes or possibly any change \nin the breast texture.");
		n8.setFont(new Font("Calibril",Font.PLAIN,16));
		n8.setEditable(false);
		tip8.add(n8);
		tip8.add(new JLabel(np8));
		JTextArea n9 = new JTextArea("Check to see/confirm if there is any nipple \ndischarge from the breast and identify the color.");
		n9.setFont(new Font("Calibril",Font.PLAIN,16));
		n9.setEditable(false);
		tip9.add(n9);
		tip9.add(new JLabel(np9));
		
		
		
		JPanel sdTipMid = new JPanel(new GridLayout(9,1,4,4));
		sdTipMid.add(tip1);
		sdTipMid.add(tip2);
		sdTipMid.add(tip3);
		sdTipMid.add(tip4);
		sdTipMid.add(tip5);
		sdTipMid.add(tip6);
		sdTipMid.add(tip7);
		sdTipMid.add(tip8);
		sdTipMid.add(tip9);
		
		JScrollPane sdTipMidS = new JScrollPane(sdTipMid);
		JPanel sdTips = new JPanel(new BorderLayout());
		JPanel sdTipsTop = new JPanel();
		sdTipMid.setBackground(new Color(250,50,50));
		sdTipsTop.add(new JLabel("Self Examination tips"));
		JPanel sdTipsLow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		sdTipsLow.add(skip);
		sdTips.add(sdTipsTop, BorderLayout.NORTH);
		sdTips.add(sdTipMidS, BorderLayout.CENTER);
		sdTips.add(sdTipsLow,BorderLayout.SOUTH);
		
	//RESULT PANELS
		
		JPanel resultGood = new JPanel(new BorderLayout());
		resultGood.setBackground(Color.white);
		JPanel rgMid = new JPanel(new BorderLayout());
		JLabel GMC = new JLabel("MEDICAL CERTIFICATE");
		GMC.setFont(new Font("Calibril",Font.BOLD,25));
		JPanel GMCP=new JPanel();
		GMCP.add(GMC);
		GMCP.setBackground(Color.cyan);
		rgMid.setBackground(Color.white);
		rgMid.add(GMCP,BorderLayout.NORTH);
		GMS.setLineWrap(true);
		GMS.setFont(new Font("Calibril",Font.PLAIN,20));
		GMS.setWrapStyleWord(true);
		GMS.setEditable(false);
		rgMid.add(GMS,BorderLayout.CENTER);
		rgMid.add(new JLabel(seal1),BorderLayout.SOUTH);
		
		
		resultGood.add(new JLabel(goodResult), BorderLayout.NORTH);
		resultGood.add(rgMid, BorderLayout.CENTER);
		
		
		
		
		
	//
		SDTestPanel.add(resultGood, "rstGood");
		SDTestPanel.add(sdTips, "tips");
		SDTestPanel.add(physicalTestP,"physical");
		SDTestPanel.add(clinicalTest,"clinical");
		
		
		SD.add(sdTop,BorderLayout.NORTH);
		SD.add(SDTestPanel,BorderLayout.CENTER);
		SD.add(sdLeft,BorderLayout.WEST);
		
		SDMasterCard.show(SDTestPanel, "tips");
		
		
		
		
		
//DASHBOARD
		Dashboard.setLayout(new BorderLayout());
		
		JPanel homeTop = new JPanel();
		homeTop.setLayout(new BorderLayout());
		homeTop.setBackground(new Color(25,250,200));
		homeTop.add(new JLabel(diybcs),BorderLayout.NORTH);
		homeTop.add(new JLabel(welcome),BorderLayout.CENTER);
		JPanel homeLeft = new JPanel();
		homeLeft.setLayout(new GridLayout(2,1));
		tips.setBackground(new Color(230,230,240));
		tips.setIcon(mLogo);
		tips.setBorderPainted(false);
		tips.setToolTipText("Click to read more on other diseases related to Cancer");
		JPanel hh = new JPanel();
		hh.setLayout(new GridLayout(5,1));
		JPanel settingsP = new JPanel();
		settingsP.setLayout(new FlowLayout(FlowLayout.CENTER));
		settings.setIcon(Set);
		settings.setBackground(new Color(239,239,245));
		settings.setBorderPainted(false);
		settings.setToolTipText("Click to make changes in your profile");
		settingsP.add(settings);
		homeLeft.add(tips);
		homeLeft.add(settingsP);
		
		
		start.setBorderPainted(false);
		start.setIcon(startButton);
		start.setBackground(Color.white);
		start.setToolTipText("Click to start your physical and Self-examination Breast Cancer Diagnose");
		JPanel startP = new JPanel();
		startP.setLayout(new GridLayout(3,1));
		startP.setBackground(Color.white);
		//startP.add(new JLabel(" "));
		JTextArea infoText = new JTextArea("\n        Note that the high incidence and mortality rates of breast cancer, as well as the high cost of treatment and limited resources available, require that it should continue to be a focus of attention for public health authorities and policy-makers. The costs and benefits of fighting breast cancer, including the positive impact that early detection and screening can have, need to be carefully weighed against other competing health needs. \n\n       So let's get started in the battle against breast cancer.");
		
		infoText.setLineWrap(true);
		infoText.setWrapStyleWord(true);
		infoText.setEditable(false);
		startP.add(infoText);
		startP.add(start);
		
		
		Dashboard.add(homeTop, BorderLayout.NORTH);
		Dashboard.add(startP,BorderLayout.CENTER);
		Dashboard.add(homeLeft,BorderLayout.WEST);
		
		
		
		
		
		
		
		
//DISPLAYS
		MasterPanel.add(Dashboard, "home");
		MasterPanel.add(WelcomePanel, "welcome");
		MasterPanel.add(RegistrationPanel, "reg");
		MasterPanel.add(tipsPanel,"tips");
		MasterPanel.add(SD,"sd");
		
		
		
		if(profile.exists()) {
			Main call = new Main();
			
			try {
				call.loader();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println(FirstName+" "+LastName);
			
			MasterCard.show(MasterPanel, "home");
		}
		else {	
		MasterCard.show(MasterPanel, "welcome");
		}
	add(MasterPanel);
	}
	
	public static void main(String [] args) {
		username = System.getProperty("user.name");
		
		Main call = new Main();
		call.WorkFrame();
		call.setSize(1000,650);
		call.setLocationRelativeTo(null);
		call.setTitle("DIY_BCS");
		call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		call.setVisible(true);
	}
	
	
	
	public class Handler implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			if (event.getSource()==proceed) {
				MasterCard.show(MasterPanel, "reg");
			}
			else if (event.getSource()==back1) {
				if (profile.exists()) {
					MasterCard.show(MasterPanel, "home");
				}
				else {
				MasterCard.show(MasterPanel, "welcome");
				}
			}
			else if (event.getSource()==submit) {
				FirstName = String.format(firstName.getText());
				LastName = String.format(lastName.getText());
				Country = String.format(country.getText());
				Age = (int) Double.parseDouble(String.format(age.getText()));
				AMenarche = (int) Double.parseDouble(String.format(ageMenarche.getText()));
				AFDelivery = (int) Double.parseDouble(String.format(ageFirstDelivery.getText()));
				
				System.out.println(FirstName+"\n"+LastName+"\n"+Country+"\n"+Age+"\n"+"\n"+AMenarche+"\n"+AFDelivery);
				
				Main call = new Main();
				try {
					call.saver();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Access Denied!\n\n\"C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\StartUp\\DIY_BCSWT.vbs\"\n Unable to create file due to Systme Administration Permission\n\nCopy \"DIY_BCS\\profile\\DIY_BCSWT.vbs\" for better performance.");
				try {
					call.loader();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==settings) {
				Main Call = new Main();
				try {
					Call.loader();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				firstName.setText(FirstName);
				lastName.setText(LastName);
				
				int a;String r = Integer.toString(a=Age);
				age.setText(r);
				country.setText(Country);
				int a2;String r2 = Integer.toString(a2=AMenarche);
				ageMenarche.setText(r2);
				int a3;String r3 = Integer.toString(a3=AFDelivery);
				ageFirstDelivery.setText(r3);
				
				MasterCard.show(MasterPanel, "reg");
			}
			else if (event.getSource()==tips) {
				MasterCard.show(MasterPanel, "tips");
			}
			else if (event.getSource()==back2) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==PEButton) {
				SDMasterCard.show(SDTestPanel, "physical");
			}
			else if (event.getSource()==skip) {
				SDMasterCard.show(SDTestPanel, "physical");
			}
			else if (event.getSource()==howTo) {
				SDMasterCard.show(SDTestPanel, "tips");
			}
			else if (event.getSource()==CTButton) {
				SDMasterCard.show(SDTestPanel, "clinical");
			}
			else if (event.getSource()==SDBack) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==start) {
				MasterCard.show(MasterPanel, "sd");
			}
			else if (event.getSource()==PTNext) {
				String BN = breastNipple.getSelectedItem().toString();
				String BS = breastSkin.getSelectedItem().toString();
				String Nur = nursing.getSelectedItem().toString();
				
				if (BN.contentEquals("Yes")) {
					nippleDischarges.setVisible(true);
				}
				else {
					nippleDischarges.setVisible(false);
					discharge1.setSelected(false);
					discharge2.setSelected(false);
					discharge3.setSelected(false);
					discharge4.setSelected(false);
				}
				if (Nur.contentEquals("Yes")) {
					nNursingP.setVisible(true);
				}
				else {
					nNursingP.setVisible(false);
				}
				if (BS.contentEquals("Yes")) {
					skinChanges.setVisible(true);
				}
				else {
					skinChanges.setVisible(false);
					skinChange1.setSelected(false);
					skinChange2a.setSelected(false);
					skinChange2b.setSelected(false);
					skinChange3.setSelected(false);
					skinChange4.setSelected(false);
					skinChange5.setSelected(false);
					skinChange6.setSelected(false);
					skinChange7.setSelected(false);
					skinChange8.setSelected(false);
				}
				SDMasterCard.show(SDTestPanel, "clinical");
			}
			else if (event.getSource()==result) {
				Main call = new Main();
				try {
					call.loader();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				String bP = bPain1.getSelectedItem().toString();
				String bW = breastWeight.getSelectedItem().toString();
				String aS = arm_swelling.getSelectedItem().toString();
				String nN1 = String.format(nNursing.getText());double nN = (int) Double.parseDouble(nN1);
				String bS = breastSize.getSelectedItem().toString();
				String Period = period.getSelectedItem().toString();
				
				if(bP.contentEquals("Yes") && bW.contentEquals("Yes") && aS.contentEquals("Yes") && Age>=21 && nN>2 && bS.contentEquals("Yes")) {
		//STAGE1 RESULT
				JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
				GMS.setText("\nTO WHOM IT MAY CONCERN\n\n   This is the certify that "+FirstName+" "+LastName+" from "+Country+" was examined by DIY_BCS with Physical and Clinical Diagnosis on Breast Cancer.\n  And would need medical attention for more Diagnosis with immediate treatment on Early Stage (Stage I) Breast Cancer which might include the following:\n\tAdjuvant Therapy\n\tRemoval of affected Cell(s) (Surgery)\n\tAdjuvant Therapy.");
				}
				else if((bP.contentEquals("Yes") && aS.contentEquals("Yes") && Age>=21 && nN>2  && (bW.contentEquals("Yes")) && (skinChange2a.isSelected()||skinChange2b.isSelected()||skinChange3.isSelected()||skinChange4.isSelected()||skinChange5.isSelected()||skinChange6.isSelected()||skinChange7.isSelected()||skinChange8.isSelected()))) {
		//STAGE2 RESULT
				JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
				GMS.setText("\nTO WHOM IT MAY CONCERN\n\n   This is the certify that "+FirstName+" "+LastName+" from "+Country+" was examined by DIY_BCS with Physical and Clinical Diagnosis on Breast Cancer.\n  And would need medical attention for more Diagnosis with immediate treatment on Locally Advance Stage (Stage II & III) Breast Cancer which might include the following:\n\tPrimary Systemic Therapy\n\tParticipation in Clinical Trial (If available).");
				}
		//STAGE2_2
				else if(skinChange2a.isSelected()||skinChange2b.isSelected()||skinChange3.isSelected()||skinChange4.isSelected()||skinChange5.isSelected()||skinChange6.isSelected()||skinChange7.isSelected()||skinChange8.isSelected()) {
					JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
					GMS.setText("\nTO WHOM IT MAY CONCERN\n\n   This is the certify that "+FirstName+" "+LastName+" from "+Country+" was examined by DIY_BCS with Physical and Clinical Diagnosis on Breast Cancer.\n  And would need medical attention for more Diagnosis with immediate treatment on Locally Advance Stage (Stage II & III) Breast Cancer which might include the following:\n\tPrimary Systemic Therapy\n\tParticipation in Clinical Trial (If available).");
					
				}
				
				else if((bP.contentEquals("Yes")||bW.contentEquals("Yes"))&&(skinChange1.isSelected()||discharge1.isSelected()||discharge2.isSelected()||discharge3.isSelected()||discharge4.isSelected())) {
		//STAGE3 RESULT
				JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
				GMS.setText("\nTO WHOM IT MAY CONCERN\n\n   This is the certify that "+FirstName+" "+LastName+" from "+Country+" was examined by DIY_BCS with Physical and Clinical Diagnosis on Breast Cancer.\n  And would need medical attention for more Diagnosis with immediate treatment on Advance or Metastatic Stage (Stage IV) Breast Cancer which might include the following:\n\tNeoadjuvant or Adjuvant Treatment\n\tSystemic Treatment Regimens (hormone therapy, chemotherapy or targeted therapies).");
				
				}
		//STAGE3_3
				else if((skinChange2a.isSelected()||skinChange2b.isSelected()||skinChange3.isSelected()||skinChange4.isSelected()||skinChange5.isSelected()||skinChange6.isSelected()||skinChange7.isSelected()||skinChange8.isSelected())&&(skinChange1.isSelected()||discharge1.isSelected()||discharge2.isSelected()||discharge3.isSelected()||discharge4.isSelected())) {
					JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
				GMS.setText("\nTO WHOM IT MAY CONCERN\n\n   This is the certify that "+FirstName+" "+LastName+" from "+Country+" was examined by DIY_BCS with Physical and Clinical Diagnosis on Breast Cancer.\n  And would need medical attention for more Diagnosis with immediate treatment on Advance or Metastatic Stage (Stage IV) Breast Cancer which might include the following:\n\tNeoadjuvant or Adjuvant Treatment\n\tSystemic Treatment Regimens (hormone therapy, chemotherapy or targeted therapies).");
				}
		//MENSTRAL RESULT
				else if(bP.contentEquals("Yes") &&bS.contentEquals("Yes") && bW.contentEquals("Yes")&&Period.contentEquals("Yes")) {
					JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
				
				GMS.setText("\nI DR. DIY_BCS  certify that I have carefully examined "+FirstName+" "+LastName+" from "+Country+". \n\nThe noticeable signs are as a result of you Menstrual condition.\nBase on the examination, I certify that the above bearer is in GOOD MENTAL AND PHYSICAL HEALTH and is free from any physical defects which may interface with her professional work including the active outdoor duties required for a professional purpose.");
				}
				
				else {
		//GOOD RESULT
				JOptionPane.showMessageDialog(null, "Hi "+FirstName+" "+LastName+"!\n\n   You have been well examined.\nPlease carefully read through the Medical Certificate\n\n\tThanks.");
				GMS.setText("\nI DR. DIY_BCS  certify that I have carefully examined "+FirstName+" "+LastName+" from "+Country+". \n\nBase on the examination, I certify that the above bearer is in GOOD MENTAL AND PHYSICAL HEALTH and is free from any physical defects which may interface with her professional work including the active outdoor duties required for a professional purpose.");
				}
				
				SDMasterCard.show(SDTestPanel, "rstGood");
			}
			
			
			
		}
		
		
	}

}
