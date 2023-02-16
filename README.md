# 1. kotlin tutorial

활용idle : android studio

kotlin 주의사항 및 삽질했던 부분
1. viewBinding = true로 설정한다.
2. xml의 id값을 갖고잇는 버튼을 활용한 구문을 작성할때, 아래와같이 binding필요
`private lateinit var binding: ActivityMainBinding`
`var binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)`
`binding.button.setContentView("입력인자들")`
