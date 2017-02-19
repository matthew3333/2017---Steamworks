package org.usfirst.frc.team1160.robot.motionProfiling;

public class MotionProfile {			

	public static final int kNumPoints =400;		
	// Position (rotations)	Velocity (RPM)	Duration (ms)
	public static double [][]Points = new double[][]{		
		{0,	0	,10},
		{2.38095238095238E-05,	0.285714286	,10},
		{0.000107142857142857,	0.714285714	,10},
		{0.000273809523809524,	1.285714286	,10},
		{0.000547619047619048,	2	,10},
		{0.000952380952380952,	2.857142857	,10},
		{0.00151190476190476,	3.857142857	,10},
		{0.00225,	5	,10},
		{0.00319047619047619,	6.285714286	,10},
		{0.00435714285714286,	7.714285714	,10},
		{0.00577380952380952,	9.285714286	,10},
		{0.00746428571428571,	11	,10},
		{0.00945238095238095,	12.85714286	,10},
		{0.0117619047619048,	14.85714286	,10},
		{0.0144166666666667,	17	,10},
		{0.0174404761904762,	19.28571429	,10},
		{0.0208571428571429,	21.71428571	,10},
		{0.0246904761904762,	24.28571429	,10},
		{0.0289642857142857,	27	,10},
		{0.0337023809523809,	29.85714286	,10},
		{0.0389285714285714,	32.85714286	,10},
		{0.0446547619047619,	35.85714286	,10},
		{0.0508809523809524,	38.85714286	,10},
		{0.0576071428571428,	41.85714286	,10},
		{0.0648333333333333,	44.85714286	,10},
		{0.0725595238095238,	47.85714286	,10},
		{0.0807857142857143,	50.85714286	,10},
		{0.0895119047619048,	53.85714286	,10},
		{0.0987380952380952,	56.85714286	,10},
		{0.108464285714286,	59.85714286	,10},
		{0.118690476190476,	62.85714286	,10},
		{0.129416666666667,	65.85714286	,10},
		{0.140642857142857,	68.85714286	,10},
		{0.152369047619048,	71.85714286	,10},
		{0.164595238095238,	74.85714286	,10},
		{0.177321428571429,	77.85714286	,10},
		{0.190547619047619,	80.85714286	,10},
		{0.204273809523809,	83.85714286	,10},
		{0.2185,	86.85714286	,10},
		{0.23322619047619,	89.85714286	,10},
		{0.248452380952381,	92.85714286	,10},
		{0.264178571428571,	95.85714286	,10},
		{0.280404761904762,	98.85714286	,10},
		{0.297130952380952,	101.8571429	,10},
		{0.314357142857143,	104.8571429	,10},
		{0.332083333333333,	107.8571429	,10},
		{0.350309523809524,	110.8571429	,10},
		{0.369035714285714,	113.8571429	,10},
		{0.388261904761905,	116.8571429	,10},
		{0.407988095238095,	119.8571429	,10},
		{0.428214285714286,	122.8571429	,10},
		{0.448940476190477,	125.8571429	,10},
		{0.470166666666667,	128.8571429	,10},
		{0.491892857142858,	131.8571429	,10},
		{0.514119047619048,	134.8571429	,10},
		{0.536845238095239,	137.8571429	,10},
		{0.560071428571429,	140.8571429	,10},
		{0.58379761904762,	143.8571429	,10},
		{0.60802380952381,	146.8571429	,10},
		{0.63275,	149.8571429	,10},
		{0.657976190476191,	152.8571429	,10},
		{0.683678571428572,	155.5714286	,10},
		{0.709821428571429,	158.1428571	,10},
		{0.736380952380953,	160.5714286	,10},
		{0.763333333333334,	162.8571429	,10},
		{0.790654761904762,	165	,10},
		{0.818321428571429,	167	,10},
		{0.846309523809525,	168.8571429	,10},
		{0.874595238095239,	170.5714286	,10},
		{0.903154761904763,	172.1428571	,10},
		{0.931964285714287,	173.5714286	,10},
		{0.961000000000001,	174.8571429	,10},
		{0.990238095238096,	176	,10},
		{1.01965476190476,	177	,10},
		{1.04922619047619,	177.8571429	,10},
		{1.07892857142857,	178.5714286	,10},
		{1.1087380952381,	179.1428571	,10},
		{1.13863095238095,	179.5714286	,10},
		{1.16858333333333,	179.8571429	,10},
		{1.19857142857143,	180	,10},
		{1.22857142857143,	180	,10},
		{1.25857142857143,	180	,10},
		{1.28857142857143,	180	,10},
		{1.31857142857143,	180	,10},
		{1.34857142857143,	180	,10},
		{1.37857142857143,	180	,10},
		{1.40857142857143,	180	,10},
		{1.43857142857143,	180	,10},
		{1.46857142857143,	180	,10},
		{1.49857142857143,	180	,10},
		{1.52857142857143,	180	,10},
		{1.55857142857143,	180	,10},
		{1.58857142857143,	180	,10},
		{1.61857142857143,	180	,10},
		{1.64857142857143,	180	,10},
		{1.67857142857143,	180	,10},
		{1.70857142857143,	180	,10},
		{1.73857142857143,	180	,10},
		{1.76857142857143,	180	,10},
		{1.79857142857143,	180	,10},
		{1.82857142857143,	180	,10},
		{1.85857142857143,	180	,10},
		{1.88857142857143,	180	,10},
		{1.91857142857143,	180	,10},
		{1.94857142857143,	180	,10},
		{1.97857142857143,	180	,10},
		{2.00857142857143,	180	,10},
		{2.03857142857143,	180	,10},
		{2.06857142857143,	180	,10},
		{2.09857142857143,	180	,10},
		{2.12857142857143,	180	,10},
		{2.15857142857143,	180	,10},
		{2.18857142857143,	180	,10},
		{2.21857142857143,	180	,10},
		{2.24857142857143,	180	,10},
		{2.27857142857143,	180	,10},
		{2.30857142857143,	180	,10},
		{2.33857142857143,	180	,10},
		{2.36857142857143,	180	,10},
		{2.39857142857143,	180	,10},
		{2.42857142857143,	180	,10},
		{2.45857142857143,	180	,10},
		{2.48857142857143,	180	,10},
		{2.51857142857143,	180	,10},
		{2.54857142857143,	180	,10},
		{2.57857142857143,	180	,10},
		{2.60857142857143,	180	,10},
		{2.63857142857143,	180	,10},
		{2.66857142857143,	180	,10},
		{2.69857142857143,	180	,10},
		{2.72857142857143,	180	,10},
		{2.75857142857143,	180	,10},
		{2.78857142857143,	180	,10},
		{2.81857142857142,	180	,10},
		{2.84857142857142,	180	,10},
		{2.87857142857142,	180	,10},
		{2.90857142857142,	180	,10},
		{2.93857142857142,	180	,10},
		{2.96857142857142,	180	,10},
		{2.99857142857142,	180	,10},
		{3.02857142857142,	180	,10},
		{3.05857142857142,	180	,10},
		{3.08857142857142,	180	,10},
		{3.11857142857142,	180	,10},
		{3.14857142857142,	180	,10},
		{3.17857142857142,	180	,10},
		{3.20857142857142,	180	,10},
		{3.23857142857142,	180	,10},
		{3.26857142857142,	180	,10},
		{3.29857142857142,	180	,10},
		{3.32857142857142,	180	,10},
		{3.35857142857142,	180	,10},
		{3.38857142857142,	180	,10},
		{3.41857142857142,	180	,10},
		{3.44857142857142,	180	,10},
		{3.47857142857142,	180	,10},
		{3.50857142857142,	180	,10},
		{3.53857142857142,	180	,10},
		{3.56857142857142,	180	,10},
		{3.59857142857142,	180	,10},
		{3.62857142857142,	180	,10},
		{3.65857142857142,	180	,10},
		{3.68857142857142,	180	,10},
		{3.71857142857142,	180	,10},
		{3.74857142857142,	180	,10},
		{3.77857142857142,	180	,10},
		{3.80857142857142,	180	,10},
		{3.83857142857142,	180	,10},
		{3.86857142857142,	180	,10},
		{3.89857142857142,	180	,10},
		{3.92857142857142,	180	,10},
		{3.95857142857142,	180	,10},
		{3.98857142857142,	180	,10},
		{4.01857142857142,	180	,10},
		{4.04857142857142,	180	,10},
		{4.07857142857142,	180	,10},
		{4.10857142857142,	180	,10},
		{4.13857142857142,	180	,10},
		{4.16857142857142,	180	,10},
		{4.19857142857142,	180	,10},
		{4.22857142857142,	180	,10},
		{4.25857142857142,	180	,10},
		{4.28857142857142,	180	,10},
		{4.31857142857142,	180	,10},
		{4.34857142857142,	180	,10},
		{4.37857142857142,	180	,10},
		{4.40857142857142,	180	,10},
		{4.43857142857142,	180	,10},
		{4.46857142857142,	180	,10},
		{4.49857142857142,	180	,10},
		{4.52857142857142,	180	,10},
		{4.55857142857142,	180	,10},
		{4.58857142857142,	180	,10},
		{4.61857142857142,	180	,10},
		{4.64857142857142,	180	,10},
		{4.67857142857142,	180	,10},
		{4.70857142857142,	180	,10},
		{4.73857142857142,	180	,10},
		{4.76857142857142,	180	,10},
		{4.79857142857142,	180	,10},
		{4.82857142857142,	180	,10},
		{4.85857142857142,	180	,10},
		{4.88857142857142,	180	,10},
		{4.91857142857142,	180	,10},
		{4.94857142857142,	180	,10},
		{4.97857142857143,	180	,10},
		{5.00857142857143,	180	,10},
		{5.03857142857143,	180	,10},
		{5.06857142857143,	180	,10},
		{5.09857142857143,	180	,10},
		{5.12857142857143,	180	,10},
		{5.15857142857143,	180	,10},
		{5.18857142857143,	180	,10},
		{5.21857142857143,	180	,10},
		{5.24857142857143,	180	,10},
		{5.27857142857143,	180	,10},
		{5.30857142857143,	180	,10},
		{5.33857142857143,	180	,10},
		{5.36857142857143,	180	,10},
		{5.39857142857143,	180	,10},
		{5.42857142857143,	180	,10},
		{5.45857142857143,	180	,10},
		{5.48857142857143,	180	,10},
		{5.51857142857143,	180	,10},
		{5.54857142857143,	180	,10},
		{5.57857142857143,	180	,10},
		{5.60857142857143,	180	,10},
		{5.63857142857143,	180	,10},
		{5.66857142857143,	180	,10},
		{5.69857142857143,	180	,10},
		{5.72857142857143,	180	,10},
		{5.75857142857143,	180	,10},
		{5.78857142857143,	180	,10},
		{5.81857142857143,	180	,10},
		{5.84857142857143,	180	,10},
		{5.87857142857143,	180	,10},
		{5.90857142857143,	180	,10},
		{5.93857142857143,	180	,10},
		{5.96857142857143,	180	,10},
		{5.99857142857143,	180	,10},
		{6.02857142857143,	180	,10},
		{6.05857142857143,	180	,10},
		{6.08857142857143,	180	,10},
		{6.11857142857143,	180	,10},
		{6.14857142857143,	180	,10},
		{6.17857142857144,	180	,10},
		{6.20857142857144,	180	,10},
		{6.23857142857144,	180	,10},
		{6.26857142857144,	180	,10},
		{6.29857142857144,	180	,10},
		{6.32857142857144,	180	,10},
		{6.35857142857144,	180	,10},
		{6.38857142857144,	180	,10},
		{6.41857142857144,	180	,10},
		{6.44857142857144,	180	,10},
		{6.47857142857144,	180	,10},
		{6.50857142857144,	180	,10},
		{6.53857142857144,	180	,10},
		{6.56857142857144,	180	,10},
		{6.59857142857144,	180	,10},
		{6.62857142857144,	180	,10},
		{6.65857142857144,	180	,10},
		{6.68857142857144,	180	,10},
		{6.71857142857144,	180	,10},
		{6.74857142857144,	180	,10},
		{6.77857142857144,	180	,10},
		{6.80857142857144,	180	,10},
		{6.83857142857144,	180	,10},
		{6.86857142857144,	180	,10},
		{6.89857142857144,	180	,10},
		{6.92857142857144,	180	,10},
		{6.95857142857144,	180	,10},
		{6.98857142857144,	180	,10},
		{7.01857142857144,	180	,10},
		{7.04857142857144,	180	,10},
		{7.07857142857144,	180	,10},
		{7.10857142857144,	180	,10},
		{7.13857142857144,	180	,10},
		{7.16857142857144,	180	,10},
		{7.19857142857144,	180	,10},
		{7.22857142857144,	180	,10},
		{7.25857142857144,	180	,10},
		{7.28857142857144,	180	,10},
		{7.31857142857144,	180	,10},
		{7.34857142857144,	180	,10},
		{7.37857142857144,	180	,10},
		{7.40857142857145,	180	,10},
		{7.43857142857145,	180	,10},
		{7.46857142857145,	180	,10},
		{7.49857142857145,	180	,10},
		{7.52857142857145,	180	,10},
		{7.55857142857145,	180	,10},
		{7.58857142857145,	180	,10},
		{7.61857142857145,	180	,10},
		{7.64857142857145,	180	,10},
		{7.67857142857145,	180	,10},
		{7.70857142857145,	180	,10},
		{7.73857142857145,	180	,10},
		{7.76857142857145,	180	,10},
		{7.79857142857145,	180	,10},
		{7.82857142857145,	180	,10},
		{7.85857142857145,	180	,10},
		{7.88857142857145,	180	,10},
		{7.91857142857145,	180	,10},
		{7.94857142857145,	180	,10},
		{7.97857142857145,	180	,10},
		{8.00857142857145,	180	,10},
		{8.03857142857145,	180	,10},
		{8.06857142857145,	180	,10},
		{8.09857142857145,	180	,10},
		{8.12857142857145,	180	,10},
		{8.15857142857145,	180	,10},
		{8.18857142857145,	180	,10},
		{8.21857142857145,	180	,10},
		{8.24857142857145,	180	,10},
		{8.27857142857144,	180	,10},
		{8.30857142857144,	180	,10},
		{8.33857142857144,	180	,10},
		{8.36857142857144,	180	,10},
		{8.39857142857144,	180	,10},
		{8.42857142857144,	180	,10},
		{8.45857142857144,	180	,10},
		{8.48857142857144,	180	,10},
		{8.51857142857144,	180	,10},
		{8.54857142857144,	180	,10},
		{8.57857142857144,	180	,10},
		{8.60857142857144,	180	,10},
		{8.63857142857144,	180	,10},
		{8.66857142857144,	180	,10},
		{8.69857142857144,	180	,10},
		{8.72857142857143,	180	,10},
		{8.75857142857143,	180	,10},
		{8.78857142857143,	180	,10},
		{8.81857142857143,	180	,10},
		{8.84857142857143,	180	,10},
		{8.87854761904762,	179.7142857	,10},
		{8.90846428571429,	179.2857143	,10},
		{8.93829761904762,	178.7142857	,10},
		{8.96802380952381,	178	,10},
		{8.99761904761905,	177.1428571	,10},
		{9.02705952380953,	176.1428571	,10},
		{9.05632142857143,	175	,10},
		{9.08538095238096,	173.7142857	,10},
		{9.11421428571429,	172.2857143	,10},
		{9.14279761904762,	170.7142857	,10},
		{9.17110714285715,	169	,10},
		{9.19911904761905,	167.1428571	,10},
		{9.22680952380953,	165.1428571	,10},
		{9.25415476190477,	163	,10},
		{9.28113095238096,	160.7142857	,10},
		{9.30771428571429,	158.2857143	,10},
		{9.33388095238096,	155.7142857	,10},
		{9.35960714285715,	153	,10},
		{9.38486904761905,	150.1428571	,10},
		{9.40964285714286,	147.1428571	,10},
		{9.43391666666667,	144.1428571	,10},
		{9.45769047619048,	141.1428571	,10},
		{9.48096428571429,	138.1428571	,10},
		{9.5037380952381,	135.1428571	,10},
		{9.52601190476191,	132.1428571	,10},
		{9.54778571428572,	129.1428571	,10},
		{9.56905952380953,	126.1428571	,10},
		{9.58983333333334,	123.1428571	,10},
		{9.61010714285715,	120.1428571	,10},
		{9.62988095238095,	117.1428571	,10},
		{9.64915476190476,	114.1428571	,10},
		{9.66792857142857,	111.1428571	,10},
		{9.68620238095238,	108.1428571	,10},
		{9.70397619047619,	105.1428571	,10},
		{9.72125,	102.1428571	,10},
		{9.73802380952381,	99.14285714	,10},
		{9.75429761904762,	96.14285714	,10},
		{9.77007142857143,	93.14285714	,10},
		{9.78534523809524,	90.14285714	,10},
		{9.80011904761905,	87.14285714	,10},
		{9.81439285714286,	84.14285714	,10},
		{9.82816666666667,	81.14285714	,10},
		{9.84144047619048,	78.14285714	,10},
		{9.85421428571429,	75.14285714	,10},
		{9.8664880952381,	72.14285714	,10},
		{9.87826190476191,	69.14285714	,10},
		{9.88953571428572,	66.14285714	,10},
		{9.90030952380953,	63.14285714	,10},
		{9.91058333333334,	60.14285714	,10},
		{9.92035714285715,	57.14285714	,10},
		{9.92963095238096,	54.14285714	,10},
		{9.93840476190477,	51.14285714	,10},
		{9.94667857142857,	48.14285714	,10},
		{9.95445238095238,	45.14285714	,10},
		{9.96172619047619,	42.14285714	,10},
		{9.9685,	39.14285714	,10},
		{9.97477380952381,	36.14285714	,10},
		{9.98054761904762,	33.14285714	,10},
		{9.98582142857143,	30.14285714	,10},
		{9.99059523809524,	27.14285714	,10},
		{9.99489285714286,	24.42857143	,10},
		{9.99875,	21.85714286	,10},
		{10.0021904761905,	19.42857143	,10},
		{10.0052380952381,	17.14285714	,10},
		{10.0079166666667,	15	,10},
	};
	
	public static double[][] get(){
		return Points;
	}
}


