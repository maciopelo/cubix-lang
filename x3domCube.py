solvedCube = """ 
<!--- def. and init. of black element with cords (0,0,0) --->
            <group DEF="blackElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='0 0 0'/>
                    </appearance> 
                    <box size='1, 1, 1'/>
                </shape> 
            </group>
            
            
            <!------------------------- CENTERS --------------------------->

            <group DEF="OrangeCenter">
                <transform translation='-1.05 0 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.12 0 0' >
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>
            

            <group DEF="RedCenter">
                <transform translation='1.05 0 0' rotation='0,0,1,0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.12 0 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="BlueCenter">
                <transform translation='0 0 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 0 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="GreenCenter">
                <transform translation='0 0 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 0 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="WhiteCenter">
                <transform translation='0 1.05 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 1.12 0' >
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="YellowCenter">
                <transform translation='0 -1.05 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 -1.12 0' >
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <!------------------------- EDGES --------------------------->

            <group DEF="OrangeBlueEdge">
                <transform translation='-1.05 0 -1.05' rotation='0,0,1,0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.12 0 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 0 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>  
            

            <group DEF="OrangeGreenEdge">
                <transform translation='-1.05 0 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.12 0 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 0 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="OrangeWhiteEdge">
                <transform translation='-1.05 1.05 0' >
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.12 1.05 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 1.12 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="OrangeYellowEdge">
                <transform translation='-1.05 -1.05 0' >
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.12 -1.05 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 -1.12 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            
    
            <group DEF="RedBlueEdge">
                <transform translation='1.05 0 -1.05' rotation='0,0,1,0'>
                    <shape USE="blackElement"/>
                </transform>
                <transform translation='1.05 0 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
                <transform translation='1.12 0 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="RedGreenEdge ">
                <transform translation='1.05 0 1.05'>
                    <shape USE="blackElement"/>
                </transform>
                <transform translation='1.05 0 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
                <transform translation='1.12 0 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>
            
            
            <group DEF="RedWhiteEdge">
                <transform translation='1.05 1.05 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.12 1.05 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.05 1.12 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="RedYellowEdge">
                <transform translation='1.05 -1.05 0'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.12 -1.05 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.05 -1.12 0'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>



            <group DEF="GreenWhiteEdge ">
                <transform translation='0 1.05 1.05'>
                    <shape USE="blackElement"/>
                </transform>
                <transform translation='0 1.05 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
                <transform translation='0 1.12 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1 '/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>



            <group DEF="GreenYellowEdge ">
                <transform translation='0 -1.05 1.05'>
                    <shape USE="blackElement"/>
                </transform>
                <transform translation='0 -1.05 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
                <transform translation='0 -1.12 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="BlueWhiteEdge">
                <transform translation='0 1.05 -1.05' rotation='0,0,1,0'>
                    <shape USE="blackElement"/>
                </transform>
                <transform translation='0 1.05 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
                <transform translation='0 1.12 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="BlueYellowEdge">
                <transform translation='0 -1.05 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='0 -1.05 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='0 -1.12 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <!------------------------- CORNERS --------------------------->


            <group DEF="BlueRedWhiteCorner">
                <transform translation='1.05 1.05 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.05 1.05 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.12 1.05 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.05 1.12 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="BlueOrangeWhiteCorner">
                <transform translation='-1.05 1.05 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.05 1.05 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.12 1.05 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 1.12 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="BlueOrangeYellowCorner">
                <transform translation='-1.05 -1.05 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.05 -1.05 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.12 -1.05 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 -1.12 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="BlueOrangeYellowCorner">
                <transform translation='1.05 -1.05 -1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.05 -1.05 -1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.04 0.04 0.96'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.12 -1.05 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.05 -1.12 -1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="GreenRedWhiteCorner">
                <transform translation='1.05 1.05 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.05 1.05 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.12 1.05 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.05 1.12 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="GreenRedYellowCorner">
                <transform translation='1.05 -1.05 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='1.05 -1.05 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.12 -1.05 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.96 0.04 0.04'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='1.05 -1.12 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            <group DEF="GreenOrangeWhiteCorner">
                <transform translation='-1.05 1.05 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.05 1.05 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.12 1.05 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 1.12 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 1'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>

            <group DEF="GreenOrangeYellowCorner">
                <transform translation='-1.05 -1.05 1.05'>
                    <shape USE="blackElement"/>
                </transform>

                <transform translation='-1.05 -1.05 1.12'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='0.16 0.56 0.17'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.12 -1.05 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 0.35 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>

                <transform translation='-1.05 -1.12 1.05'>
                    <shape> 
                        <appearance> 
                            <material diffuseColor='1 1 0'/>
                        </appearance> 
                        <box size='0.9, 0.9, 0.9'/>
                    </shape>
                </transform>
            </group>


            </Background>


"""