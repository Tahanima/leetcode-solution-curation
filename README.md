Welcome to the *LeetCode Solution Curation* repository! 👋
---

[LeetCode](https://leetcode.com/) is one of the most well-known online judge platforms which provides hands-on training on real coding interview questions. This repository aims to curate solutions and resources for as many LeetCode problems as possible.

*The contents of this repository will get published [here](https://tahanima.github.io/hello-leetcode/)*. So, don't forget to check it out.

## Contributing
If you would like to contribute to the repository, make sure to go through the following steps:

### Step 0 ###
* **Fork**  
You can get your own copy of [leetcode-solution-curation](https://github.com/Tahanima/leetcode-solution-curation) by using the <a href="https://github.com/Tahanima/leetcode-solution-curation/new/main?readme=1#fork-destination-box"><kbd><b>Fork</b></kbd></a> button or by clicking [this](https://github.com/Tahanima/leetcode-solution-curation/new/main?readme=1#fork-destination-box).

* **Clone**  
You need to clone, i.e, download your copy of the repository to your local machine using the following command in the terminal.
```bash
# Creates a folder named `leetcode-solution-curation` in the current directory with appropriate resources

$ git clone https://github.com/[your_username]/leetcode-solution-curation.git
```
Once you have cloned the `leetcode-solution-curation` repository, your next task is to move to that folder using the following command.
```bash
# Changes current directory to a folder named `leetcode-solution-curation`

$ cd leetcode-solution-curation
```

* **Setup**  
Now, you need to run the following command to see that your local copy has a reference to your forked remote repository in GitHub.
```bash
$ git remote -v
origin  https://github.com/[your_username]/leetcode-solution-curation.git (fetch)
origin  https://github.com/[your_username]/leetcode-solution-curation.git (push)
```
You need to then add a reference to the original [leetcode-solution-curation](https://github.com/Tahanima/leetcode-solution-curation).

```bash
# Adds a new remote named `upstream`

$ git remote add upstream https://github.com/Tahanima/leetcode-solution-curation.git
```

* **Sync**  
Try to always keep your copy of the repository updated with the original repository. Before making any changes and/or in an appropriate interval, run the following commands to update your local repository.

```bash
# Switches to `main` branch
$ git checkout main

# Resets local `main` branch to match `upstream` repository's `main` branch
$ git reset --hard upstream/main

# Push changes to your forked `leetcode-solution-curation` repo
$ git push origin main
```

### Step 1 ###
Once you are done with *Step 0*, you are ready to make your contributions. Please make sure to create branches for your contributions.

```bash
# Creates a new branch named `branch_name` and switches to it
$ git checkout -b branch_name

# Switches to an existing branch named `branch_name`
$ git checkout branch_name

# Adds a file with the path `path_to_file` respective to the root directory
$ git add path_to_file

# Associates the message 'relevant message' to the file you have changed
$ git commit -m 'relevant message'

# Pushes your changes to your remote repository
$ git push -u origin branch_name
```

Now, go to the repository from your browser and click on `compare and pull requests`. Then, add a title and a description to your pull request and submit it.

## License
<a rel="license" href="https://opensource.org/licenses/MIT"><img alt="MIT License" style="border-width:0" height="50" src="https://w7.pngwing.com/pngs/514/841/png-transparent-mit-license-bsd-licence-open-source-license-copyright-miscellaneous-text-logo.png" /></a><br />This work is licensed under the <a rel="license" href="https://opensource.org/licenses/MIT">MIT License</a>.
