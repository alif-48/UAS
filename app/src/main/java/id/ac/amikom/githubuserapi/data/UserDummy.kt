package id.ac.amikom.githubuserapi.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
            "agungjp",
            "https://avatars1.githubusercontent.com/u/8330535?v=4",
            "https://github.com/agungjp",
            "https://api.github.com/users/agungjp/followers",
            10,
            "https://api.github.com/users/agungjp/following{/other_user}",
            15,
            "https://api.github.com/users/agungjp/repos",
            10

        ))
        list.add(User(
            "agungjp2",
            "https://avatars1.githubusercontent.com/u/8330535?v=4",
            "https://github.com/agungjp",
            "https://api.github.com/users/agungjp/followers",
            10,
            "https://api.github.com/users/agungjp/following{/other_user}",
            15,
            "https://api.github.com/users/agungjp/repos",
            10

        ))

        list.add(User(
            "agungjp3",
            "https://avatars1.githubusercontent.com/u/8330535?v=4",
            "https://github.com/agungjp",
            "https://api.github.com/users/agungjp/followers",
            10,
            "https://api.github.com/users/agungjp/following{/other_user}",
            15,
            "https://api.github.com/users/agungjp/repos",
            10

        ))

        list.add(User(
            "agungjp4",
            "https://avatars1.githubusercontent.com/u/8330535?v=4",
            "https://github.com/agungjp",
            "https://api.github.com/users/agungjp/followers",
            10,
            "https://api.github.com/users/agungjp/following{/other_user}",
            15,
            "https://api.github.com/users/agungjp/repos",
            10

        ))
        list.add(User(
            "agungjp5",
            "https://avatars1.githubusercontent.com/u/8330535?v=4",
            "https://github.com/agungjp",
            "https://api.github.com/users/agungjp/followers",
            10,
            "https://api.github.com/users/agungjp/following{/other_user}",
            15,
            "https://api.github.com/users/agungjp/repos",
            10

        ))
        return list
    }
}