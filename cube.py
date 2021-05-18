from copy import deepcopy

class Cube:

    COLORS = {
        "red": "'0.96 0.04 0.04'",
        "green": "'0.16 0.56 0.17'",
        "blue": "'0.04 0.04 0.96'",
        "yellow": "'1 1 0'",
        "white": "'1 1 1'",
        "orange": "'1 0.35 0'",
    }


    def __init__(self, setting, right_center="red", front_center="green", top_center="white"):
        self.right_center = right_center
        self.front_center = front_center
        self.top_center = top_center

        #parser
        if setting is None:
            red=["red","red","red","red","red","red","red","red"]
            green=["green","green","green","green","green","green","green","green"]
            blue= ["blue","blue","blue","blue","blue","blue","blue","blue"]        
            yellow = ["yellow","yellow","yellow","yellow","yellow","yellow","yellow","yellow"]
            white=["white","white","white","white","white","white","white","white"]
            orange=["orange","orange","orange","orange","orange","orange","orange","orange"]
        else:
            red = setting["red"]
            green = setting["green"]
            blue = setting["blue"]
            yellow = setting["yellow"]
            white = setting["white"]
            orange = setting["orange"]

        loc = locals()
        self.right_side = loc[right_center]
        self.top_side = loc[top_center]
        self.front_side = loc[front_center]
        self.left_side = loc[self._opposite_side(right_center)]
        self.bottom_side = loc[self._opposite_side(top_center)]
        self.back_side = loc[self._opposite_side(front_center)]

    
    def set_initial_setting(self):
        self.right_side = ["red","red","red","red","red","red","red","red"]
        self.top_side = ["white","white","white","white","white","white","white","white"]
        self.front_side = ["green","green","green","green","green","green","green","green"]
        self.left_side = ["orange","orange","orange","orange","orange","orange","orange","orange"]
        self.bottom_side = ["yellow","yellow","yellow","yellow","yellow","yellow","yellow","yellow"]
        self.back_side = ["blue","blue","blue","blue","blue","blue","blue","blue"] 

        

    def _opposite_side(self, center):
        if center == "red":
            return "orange"
        if center == "orange":
            return "red"
        if center == "white":
            return "yellow"
        if center == "yellow":
            return "white"
        if center == "blue":
            return "green"
        if center == "green":
            return "blue"

    def coordinates(self, side, i):
        coord1=[-1.05, 0, 1.05, -1.05, 1.05, -1.05, 0, 1.05]
        coord2=[1.05,1.05,1.05,0,0,-1.05,-1.05,-1.05]
        if side=="front":
            return [coord1[i],coord2[i],1.12]
        if side=="back":
            return [coord1[i],-coord2[i],-1.12]
        if side=="top":
            return [coord1[i],1.12,-coord2[i]]
        if side=="bottom":
            return [coord1[i],-1.12,coord2[i]]
        if side=="right":
            return [1.12,coord2[i],-coord1[i]]
        if side=="left":
            return [-1.12,coord2[i], coord1[i]]

    def coordinates_black(self,side,i):
        coord1=[-1.05,0,1.05,-1.05,1.05,-1.05,0,1.05]
        coord2=[1.05,1.05,1.05,0,0,-1.05,-1.05,-1.05]
        if side=="front":
            return [coord1[i],coord2[i],1.05]
        if side=="back":
            return [-coord1[i],coord2[i],-1.05]
        if side=="top":
            return [coord1[i],1.05,coord2[i]]
        if side=="bottom":
            return [coord1[i],-1.05,-coord2[i]]
        if side=="right":
            return [1.05,coord2[i],coord1[i]]
        if side=="left":
            return [-1.05,coord2[i],-coord1[i]]
            
            

    def _rotate_vert(self, main_side, s1, s2, s3, s4, nums, prim=False):
        temp_1 = [i for i in s1]
        if not prim:
            self.rotate_side(main_side)
            for i in nums:
                s1[i] = s4[i]
                s4[i]=s3[i]
                s3[i]=s2[i]
                s2[i]=temp_1[i]
        else:
            self.rotate_side(main_side, clockwise=False)
            for i in nums:
                s1[i] = s2[i]
                s2[i]=s3[i]
                s3[i]=s4[i]
                s4[i]=temp_1[i]
    
    def rotate_side(self, main_side, clockwise = True):
        temp = [i for i in main_side]
        if clockwise:
            main_side[0] = temp[5]
            main_side[1] = temp[3]
            main_side[2] = temp[0]
            main_side[3] = temp[6]
            main_side[4] = temp[1]
            main_side[5] = temp[7]
            main_side[6] = temp[4]
            main_side[7] = temp[2]
        else:
            main_side[0] = temp[2]
            main_side[1] = temp[4]
            main_side[2] = temp[7]
            main_side[3] = temp[1]
            main_side[4] = temp[6]
            main_side[5] = temp[0]
            main_side[6] = temp[3]
            main_side[7] = temp[5]

    def rotate_R(self):
        self._rotate_vert(self.right_side, self.top_side, self.back_side, self.bottom_side, self.front_side, [2, 4, 7])

    def rotate_R1(self):
        self._rotate_vert(self.right_side, self.top_side, self.back_side, self.bottom_side, self.front_side, [2, 4, 7], prim=True)

    def rotate_L(self):
        self._rotate_vert(self.left_side, self.top_side, self.front_side, self.bottom_side, self.back_side, [0, 3, 5])

    def rotate_L1(self):
        self._rotate_vert(self.left_side, self.top_side, self.front_side, self.bottom_side, self.back_side, [0, 3, 5], prim=True)

    def rotate_U(self):
        self.rotate_side(self.top_side)
        front = deepcopy(self.front_side)
        self.front_side[0:3] = self.right_side[0:3]
        self.right_side[0:3] = self.back_side[7:4:-1]
        self.back_side[7:4:-1] = self.left_side[0:3]
        self.left_side[0:3] = front[0:3]

    def rotate_U1(self):
        self.rotate_side(self.top_side, clockwise=False)
        front = deepcopy(self.front_side)
        self.front_side[0:3] = self.left_side[0:3]
        self.left_side[0:3] = self.back_side[7:4:-1]
        self.back_side[7:4:-1] = self.right_side[0:3]
        self.right_side[0:3] = front[0:3]

    def rotate_D(self):
        self.rotate_side(self.bottom_side)
        front = deepcopy(self.front_side)
        self.front_side[5:8] = self.left_side[5:8]
        self.left_side[5:8] = self.back_side[0:3][::-1]
        self.back_side[0:3] = self.right_side[7:4:-1]
        self.right_side[5:8] = front[5:8]

    def rotate_D1(self):
        self.rotate_side(self.bottom_side, clockwise=False)
        front = deepcopy(self.front_side)
        self.front_side[5:8] = self.right_side[5:8]
        self.right_side[5:8] = self.back_side[0:3][::-1]
        self.back_side[0:3] = self.left_side[7:4:-1]
        self.left_side[5:8] = front[5:8]

    def rotate_F(self):
        self.rotate_side(self.front_side)
        top = deepcopy(self.top_side)
        self.top_side[5:8] = self.left_side[2], self.left_side[4], self.left_side[7]
        self.left_side[2], self.left_side[4], self.left_side[7] = self.bottom_side[0:3]
        self.bottom_side[0:3] = self.right_side[0], self.right_side[3], self.right_side[5]
        self.right_side[0], self.right_side[3], self.right_side[5] = top[5:8]

    def rotate_F1(self):
        self.rotate_side(self.front_side, clockwise=False)
        top = deepcopy(self.top_side)
        self.top_side[5:8] = self.right_side[0], self.right_side[3], self.right_side[5]
        self.right_side[0], self.right_side[3], self.right_side[5] =self.bottom_side[0:3]
        self.bottom_side[0:3] = self.left_side[2], self.left_side[4], self.left_side[7] 
        self.left_side[2], self.left_side[4], self.left_side[7] = top[5:8]

    def rotate_B(self):
        self.rotate_side(self.back_side)
        top = deepcopy(self.top_side)
        self.top_side[0:3] = self.right_side[2], self.right_side[4], self.right_side[7]
        self.right_side[2], self.right_side[4], self.right_side[7] = self.bottom_side[5:8]
        self.bottom_side[5:8] = self.left_side[0], self.left_side[3], self.left_side[5]
        self.left_side[0], self.left_side[3], self.left_side[5] = top[0:3]
        
    def rotate_B1(self):
        self.rotate_side(self.back_side, clockwise=False)
        top = deepcopy(self.top_side)
        self.top_side[0:3] = self.left_side[0], self.left_side[3], self.left_side[5]
        self.left_side[0], self.left_side[3], self.left_side[5] = self.bottom_side[5:8]
        self.bottom_side[5:8] = self.right_side[2], self.right_side[4], self.right_side[7]
        self.right_side[2], self.right_side[4], self.right_side[7] = top[0:3]

    def rotate_M(self):
        self.front_center, self.top_center = self.top_center, self._opposite_side(self.front_center)
        top = deepcopy(self.top_side)
        for ind in (1,6):
            self.top_side[ind] = self.back_side[ind]
            self.back_side[ind] = self.bottom_side[ind]
            self.bottom_side[ind] = self.front_side[ind]
            self.front_side[ind] = top[ind]

    def rotate_M1(self):
        self.front_center, self.top_center = self._opposite_side(self.top_center), self.front_center
        top = deepcopy(self.top_side)
        for ind in (1,6):
            self.top_side[ind] = self.front_side[ind]
            self.front_side[ind] = self.bottom_side[ind]
            self.bottom_side[ind] = self.back_side[ind]
            self.back_side[ind] = top[ind]

    def rotate_E(self):
        self.front_center, self.right_center = self._opposite_side(self.right_center), self.front_center
        front = deepcopy(self.front_side)
        self.front_side[3:5] = self.left_side[3:5]
        self.left_side[3:5] = self.back_side[4:2:-1]
        self.back_side[3:5] = self.right_side[4:2:-1]
        self.right_side[3:5] = front[3:5]

    def rotate_E1(self):
        self.front_center, self.right_center = self.right_center, self._opposite_side(self.front_center)
        front = deepcopy(self.front_side)
        self.front_side[3:5] = self.right_side[3:5]
        self.right_side[3:5] = self.back_side[4:2:-1]
        self.back_side[3:5] = self.left_side[4:2:-1]
        self.left_side[3:5] = front[3:5]

    def rotate_S(self):
        self.top_center, self.right_center = self._opposite_side(self.right_center), self.top_center
        top = deepcopy(self.top_side)
        self.top_side[3:5] = self.left_side[1], self.left_side[6]
        self.left_side[1], self.left_side[6] = self.bottom_side[3:5]
        self.bottom_side[3:5] = self.right_side[1], self.right_side[6]
        self.right_side[1], self.right_side[6] = top[3:5]

    def rotate_S1(self):
        self.top_center, self.right_center = self.right_center, self._opposite_side(self.top_center)
        top = deepcopy(self.top_side)
        self.top_side[3:5] = self.right_side[1], self.right_side[6]
        self.right_side[1], self.right_side[6] = self.bottom_side[3:5]
        self.bottom_side[3:5] = self.left_side[1], self.left_side[6]
        self.left_side[1], self.left_side[6] = top[3:5]

    def rotate_R2(self):
        for _ in range(2):
            self.rotate_R
    
    def rotate_L2(self):
        for _ in range(2):
            self.rotate_L
        
    def rotate_U2(self):
        for _ in range(2):
            self.rotate_U
    
    def rotate_D2(self):
        for _ in range(2):
            self.rotate_D
    
    def rotate_F2(self):
        for _ in range(2):
            self.rotate_F
    
    def rotate_B2(self):
        for _ in range(2):
            self.rotate_B

    def rotate_M2(self):
        for _ in range(2):
            self.rotate_M
            
    def rotate_E2(self):
        for _ in range(2):
            self.rotate_E
            
    def rotate_S2(self):
        for _ in range(2):
            self.rotate_S

    def rotate_r_(self):
        self.rotate_R()
        self.rotate_M1()

    def rotate_r1_(self):
        self.rotate_R1()
        self.rotate_M()

    def rotate_l_(self):
        self.rotate_L()
        self.rotate_M()

    def rotate_l1_(self):
        self.rotate_L1()
        self.rotate_M1()

    def rotate_u_(self):
        self.rotate_U()
        self.rotate_E1()

    def rotate_u1_(self):
        self.rotate_U1()
        self.rotate_E()

    def rotate_d_(self):
        self.rotate_D()
        self.rotate_E()

    def rotate_d1_(self):
        self.rotate_D1()
        self.rotate_E1()
    
    def rotate_f_(self):
        self.rotate_F()
        self.rotate_S()

    def rotate_f1_(self):
        self.rotate_F1()
        self.rotate_S1()

    def rotate_b_(self):
        self.rotate_B()
        self.rotate_S1()

    def rotate_b1_(self):
        self.rotate_B1()
        self.rotate_S()

    def rotate_x_(self):
        self.rotate_r_()
        self.rotate_L1()

    def rotate_x1(self):
        self.rotate_r1_()
        self.rotate_L()

    def rotate_y_(self):
        self.rotate_u_()
        self.rotate_D1()

    def rotate_y1(self):
        self.rotate_u1_()
        self.rotate_D()

    def rotate_z_(self):
        self.rotate_f_()
        self.rotate_B1()

    def rotate_z1(self):
        self.rotate_f1_()
        self.rotate_B()

    def rotate_r2_(self):
        for _ in range(2):
            self.rotate_r_()
            
    def rotate_l2_(self):
        for _ in range(2):
            self.rotate_l_()
            
    def rotate_u2_(self):
        for _ in range(2):
            self.rotate_u_()
            
    def rotate_d2_(self):
        for _ in range(2):
            self.rotate_d_()
            
    def rotate_f2_(self):
        for _ in range(2):
            self.rotate_f_()
            
    def rotate_b2_(self):
        for _ in range(2):
            self.rotate_b_()

    def rotate_x2(self):
        for _ in range(2):
            self.rotate_x_()
            
    def rotate_y2(self):
        for _ in range(2):
            self.rotate_y_()
            
    def rotate_z2(self):
        for _ in range(2):
            self.rotate_z_()

    def to_x3dom(self):
        result = ""
        result += f"""
            <group DEF="LeftCenter">
                <transform translation='-1.05 0 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.12 0 0' >
                    <shape USE='{self._opposite_side(self.right_center)}Element'/>
                </transform>
            </group>
        """
        result += f"""
            <group DEF="RightCenter">
                <transform translation='1.05 0 0' rotation='0,0,1,0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.12 0 0'>
                    <shape USE='{self.right_center}Element'/>
                </transform>
            </group>
        """
        result += f"""
            <group DEF="FrontCenter">
                <transform translation='0 0 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 0 1.12'>
                    <shape USE='{self.front_center}Element'/>
                </transform>
            </group>
        """
        result += f"""
            <group DEF="BackCenter">
                <transform translation='0 0 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 0 -1.12'>
                    <shape USE='{self._opposite_side(self.front_center)}Element'/>
                </transform>
            </group>
        """
        result += f"""
            <group DEF="TopCenter">
                <transform translation='0 1.05 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 1.12 0' >
                    <shape USE='{self.top_center}Element'/>
                </transform>
            </group>
        """
        result += f"""
            <group DEF="BottomCenter">
                <transform translation='0 -1.05 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 -1.12 0' >
                    <shape USE='{self._opposite_side(self.top_center)}Element'/>
                </transform>
            </group>
        """


        sides={"front": self.front_side, "back": self.back_side, "left": self.left_side, 
                "right": self.right_side, "top": self.top_side, "bottom": self.bottom_side}
        
        for name in sides:
            for i in range(8):
                coords = self.coordinates_black(name, i)
                result += f"""
                    <transform translation='{coords[0]} {coords[1]} {coords[2]}'>
                        <shape USE="blackElement"/>
                    </transform>
                """

        for name, side in sides.items():
            for i, color in enumerate(side):
                coords=self.coordinates(name, i)
                result += f"""
                <group DEF="{name}Square{i}">
                    <transform translation='{coords[0]} {coords[1]} {coords[2]}' >
                        <shape> 
                            <appearance> 
                                <material id="{name}Square{i}Color" diffuseColor={self.COLORS[color]}/>
                            </appearance> 
                            <box size='0.9, 0.9, 0.9'/>
                        </shape> 
                    </transform>
                </group>
            """

        return result